package ro.unibuc.electronicpunchcard.model;

public class contract {

private String contractId;

private String contractName;

    public contract(String contractId, String contractName) {
        this.contractId = contractId;
        this.contractName = contractName;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("contract{");
        sb.append("contractId='").append(contractId).append('\'');
        sb.append(", contractName='").append(contractName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getContractID() {
        return 0;
    }
}
