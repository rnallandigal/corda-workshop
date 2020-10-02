package com.dtcc.tril.workshop.states;

import com.dtcc.tril.workshop.contracts.CashContract;
import net.corda.core.contracts.ContractState;
import net.corda.core.contracts.BelongsToContract;
import net.corda.core.identity.Party;
import net.corda.core.identity.AbstractParty;
import java.util.List;
import java.util.ArrayList;

// *********
// * State *
// *********
@BelongsToContract(CashContract.class)
public class Cash implements ContractState {

    /**
     * TODO: Add data that represents a Cash state
     * 1. currency: String
     * 2. amount: double
     * 3. owner: Party
     */
     
    private List<AbstractParty> participants;

    // TODO: Add a constructor with fields currency, amount, owner
    public Cash(/* add your params here */) {
        // Populate private variables with the passed in parameters
        // this. ... = ...
        
        this.participants = new ArrayList<>();
        this.participants.add(owner);
    }

    public String getCurrency() { return currency; }
    public double getAmount() { return amount; }
    public Party getOwner() { return owner; }

    /* This method will indicate who are the participants and required signers when
     * this state is used in a transaction. */
    @Override
    public List<AbstractParty> getParticipants() { return this.participants; }

    public void addParticipant(AbstractParty party) {
        this.participants.add(party);
    }
}