package com.practice.order.domain.partner;

public class partnerServiceImple implements PartnerService{

    @Override
    public PartnerInfo registerPartner(PartnerCommand command) {
        //1. command -> initPartner
        //2. initpartner save to DB
        //3. Partner -> PartnerInfo And return;

        var initPartner : Partner =Partner.builder()
                .name(command.getPartnerName())
                .businessNO(command.getBusinessNo())
                .email(command.getEmail())
                .build();
        return null;


    }

    @Override
    public PartnerInfo getPartnerInfo(String partnerToken) {
        return null;
    }

    @Override
    public PartnerInfo enablePartner(String partnerToken) {
        return null;
    }

    @Override
    public PartnerInfo disablePartner(String partnerToken) {
        return null;
    }
}
