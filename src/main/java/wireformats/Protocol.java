package wireformats;

public interface Protocol {
    public int NodeReportsOverlaySetupStatus = 0;
    public int OverlayNodeReportsTaskFinished = 1;
    public int OverlayNodeReportsTrafficSummary = 2;
    public int OverlayNodeSendsData = 3;
    public int OverlayNodeSendsDeregistration = 4;
    public int OverlayNodeSendsRegistration = 5;
    public int RegistryReportsDeregistrationStatus = 6;
    public int RegistryReportsRegistrationStatus = 7;
    public int RegistryRequestsTaskInitiate = 8;
    public int RegistryRequestsTrafficSummary = 9;
    public int RegistrySendsNodeManifest = 10;
}
