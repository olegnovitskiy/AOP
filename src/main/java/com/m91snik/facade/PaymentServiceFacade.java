/**
 * Created by m91snik on 01.03.15.
 */
package com.m91snik.facade;

import com.m91snik.business.service.PaymentService;
import com.m91snik.business.session.dto.Group;
import com.m91snik.business.session.dto.Session;
import com.m91snik.contract.SessionRequired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceFacade {

    @Autowired
    private PaymentService paymentService;

    @SessionRequired(group = Group.USER)
    public void creditPayment(Session session, List<Long> amount) {
        paymentService.doCredit(amount);
    }
}
