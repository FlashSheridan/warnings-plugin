package hudson.plugins.warnings.tokens;

import hudson.Extension;
import hudson.plugins.analysis.core.BuildResult;
import hudson.plugins.warnings.AggregatedWarningsResultAction;

/**
 * Provides a token that contain details of new warnings.
 *
 * @author Benedikt Spranger
 * @deprecated replaced by classes of io.jenkins.plugins.analysis package
 */
@Deprecated
@Extension(optional = true)
public class DetailedNewWarningsTokenMacro extends AbstractDetailedTokenMacro {
    /**
     * Creates a new instance of {@link DetailedNewWarningsTokenMacro}.
     */
    @SuppressWarnings("unchecked")
    public DetailedNewWarningsTokenMacro() {
        super("WARNINGS_NEW_DETAILED", AggregatedWarningsResultAction.class);
    }

    @Override
    protected String evaluate(final BuildResult result) {
        return evalWarnings(result, result.getNewWarnings()).replace("<br>", "\n");
    }
}
