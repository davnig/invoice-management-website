import {Injectable} from '@angular/core';
import {ProfitabilityCoefficient, SocialSecurityRate, SubstituteTax} from "../../../@core/models/tax";

@Injectable()
export class TaxProfileService {

  substituteTax: SubstituteTax = 0.05;
  profitabilityCoefficient: ProfitabilityCoefficient = 0.67;
  socialSecurityRate: SocialSecurityRate = 0.2623;

  constructor() {
  }

}
