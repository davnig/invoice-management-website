CREATE TABLE t_profitability_coefficient (
    id serial,
    coefficient decimal NOT NULL,
    description varchar(256) NULL,
    CONSTRAINT PK_t_profitability_coefficient PRIMARY KEY (id)
);

CREATE TABLE t_social_security (
    id serial,
    name varchar(128) NOT NULL,
    rate decimal NOT NULL,
    CONSTRAINT PK_t_social_security PRIMARY KEY (id)
);

CREATE TABLE t_flat_rate_scheme (
    id serial,
    name varchar(128) NOT NULL,
    rate decimal NOT NULL,
    CONSTRAINT PK_t_flat_rate_scheme PRIMARY KEY (id)
);

CREATE TABLE t_tax_profile (
    id serial,
    id_prof_coefficient int NULL,
    id_social_security_fund int NULL,
    id_flat_rate_scheme int NULL,
    CONSTRAINT PK_t_tax_profile PRIMARY KEY (id),
    CONSTRAINT FK_t_tax_profile_id_prof_coefficient FOREIGN KEY (id_prof_coefficient) REFERENCES t_profitability_coefficient(id),
    CONSTRAINT FK_t_tax_profile_id_social_security_fund FOREIGN KEY (id_social_security_fund) REFERENCES t_social_security(id),
    CONSTRAINT FK_t_tax_profile_id_flat_rate_scheme FOREIGN KEY (id_flat_rate_scheme) REFERENCES t_flat_rate_scheme(id)
);

CREATE TABLE t_taxable_subject (
    p_iva varchar(11) NOT NULL,
    first_name varchar(128) NOT NULL,
    last_name varchar(128) NOT NULL,
    tax_code varchar(16) NULL,
    id_tax_profile int NOT NULL, 
    CONSTRAINT PK_t_taxable_subject PRIMARY KEY (p_iva),
    CONSTRAINT FK_t_taxable_subject_id_tax_profile FOREIGN KEY (id_tax_profile) REFERENCES t_tax_profile(id)
);

CREATE TABLE t_client (
    tax_code varchar(16) NOT NULL,
    name varchar(128) NOT NULL,
    address varchar(255) NOT NULL,
    CONSTRAINT PK_t_client PRIMARY KEY (tax_code)
);

CREATE TABLE t_invoice (
    id serial,
    number int NOT NULL,
    emission_date timestamp NOT NULL,
    id_vendor varchar(11) NOT NULL,
    id_client varchar(16) NOT NULL,
    CONSTRAINT PK_t_invoice PRIMARY KEY (id),
    CONSTRAINT FK_t_invoice_id_vendor FOREIGN KEY (id_vendor) REFERENCES t_taxable_subject(p_iva),
    CONSTRAINT FK_t_invoice_id_client FOREIGN KEY (id_client) REFERENCES t_client(tax_code)
);

CREATE TABLE t_billing_item_type (
    id serial,
    name varchar(255) NOT NULL,
    CONSTRAINT PK_t_billing_item_type PRIMARY KEY (id)
);

CREATE TABLE t_billing_item (
    id serial,
    description varchar(255) NOT NULL,
    quantity int NOT NULL,
    price int NOT NULL,
    id_type int NOT NULL,
    CONSTRAINT PK_t_billing_item PRIMARY KEY (id),
    CONSTRAINT FK_t_billing_item_id_type FOREIGN KEY (id_type) REFERENCES t_billing_item_type(id)
);

INSERT INTO t_social_security VALUES
(default, 'gestione separata INPS', 0.2623),
(default, 'inarcassa', 0.1450);

INSERT INTO t_profitability_coefficient VALUES
(default, 0.40, 'alloggio e ristorazione, commercio al dettaglio e all''ingrosso, commercio di alimenti e bevande, industrie alimentari e delle bevande'),
(default, 0.54, 'commercio ambulante non alimentare'),
(default, 0.62, 'intermediari del commercio'),
(default, 0.67, 'altre attività economiche'),
(default, 0.78, 'attività professionali, scientifiche, tecniche, sanitarie di istruzione, servizi finanziari e assicurativi'),
(default, 0.86, 'costruzione e attività immobiliari');

INSERT INTO t_flat_rate_scheme VALUES
(default, 'ordinario', 0.15),
(default, 'startup', 0.05);

INSERT INTO t_tax_profile VALUES 
(default, 4, 1, 2);

INSERT INTO t_taxable_subject VALUES 
('0764352056C', 'Davide', 'Rossi', 'DVDRSS91A01L424G', 1);

--INSERT INTO t_client VALUES ();
--INSERT INTO t_invoice ();
