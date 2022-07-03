package com.practice.order.domain.partner;

public interface PartnerService {
    //xxxCommand : 명령 엔틴티
    //xxxCriteria : 조회성 엔티티

    //xxxInfo : response Entity

    PartnerInfo registerPartner(PartnerCommand command);
    PartnerInfo getPartnerInfo(String partnerToken);
    PartnerInfo enablePartner(String partnerToken);
    PartnerInfo disablePartner(String partnerToken);
}
