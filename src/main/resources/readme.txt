public class DefaultNamespaceHandlerResolver implements NamespaceHandlerResolver {
/**
 * The location to look for the mapping files. Can be present in multiple JAR files.
 */
public static final String DEFAULT_HANDLER_MAPPINGS_LOCATION = "META-INF/spring.handlers";

------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------

public class PluggableSchemaResolver implements EntityResolver {
/**
 * The location of the file that defines schema mappings.
 * Can be present in multiple JAR files.
 */
public static final String DEFAULT_SCHEMA_MAPPINGS_LOCATION = "META-INF/spring.schemas";
