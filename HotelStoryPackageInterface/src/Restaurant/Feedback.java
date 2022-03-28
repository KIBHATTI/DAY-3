package Restaurant;

public class Feedback {
    private String feedbackForm;

    public String getFeedbackForm() {
        return feedbackForm;
    }

    public void setFeedbackForm(String feedbackForm) {
        this.feedbackForm = feedbackForm;
    }
    public Feedback giveFeedback(String feedbackForm)
    {
       // super();
        //this.feedbackForm= feedbackForm;
        Feedback fdbk = new Feedback(fdbk.getFeedbackForm());
        System.out.println(""+fdbk);
        return
    }
}
