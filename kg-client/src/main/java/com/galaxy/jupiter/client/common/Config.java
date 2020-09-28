package com.galaxy.jupiter.client.common;

/**
 * @Author zhangzhengguang
 * @Description //常量类
 * @Date 6:08 PM 2019/5/7
 **/
public class Config {


    //图探索相关
    public static final String code = "code";
    public static final String name = "name";
    //图探索需要合并的边的label 当不设置时默认全部合并
    public static final String[] needMergeLinkBeanLabels = {

    };

    //图设置错误信息
    public class ResponseCodeAndMsg {
        //成功状态码
        public static final String SUCCESS_CODE = "0000";
        public static final String SUCCESS_MSG = "请求成功";

        // 权限状态码
        public static final String AUTH_UNAUTHENTICATED_CODE = "0010";
        public static final String AUTH_UNAUTHENTICATED_MSG = "未登陆（没有JWT token）";
        public static final String AUTH_USER_NOT_FOUND_CODE = "0011";
        public static final String AUTH_USER_NOT_FOUND_MSG = "用户不存在!";
        public static final String AUTH_UNAUTHORIZED_CODE = "0012";
        public static final String AUTH_UNAUTHORIZED_MSG = "没有权限访问";
        public static final String AUTH_JWT_EXPIRED_CODE = "0013";
        public static final String AUTH_JWT_EXPIRED_MSG = "jwt token 已过期";
        public static final String AUTH_CANNOT_FIND_USER_BY_ID_CODE = "0014";
        public static final String AUTH_CANNOT_FIND_USER_BY_ID_MSG = "数据库中不存在该userId";
        public static final String AUTH_CANNOT_FIND_GROUP_BY_ID_CODE = "0015";
        public static final String AUTH_CANNOT_FIND_GROUP_BY_ID_MSG = "数据库中不存在该userId";
        public static final String AUTH_CANNOT_FIND_ROLE_BY_ID_CODE = "0016";
        public static final String AUTH_CANNOT_FIND_ROLE_BY_ID_MSG = "数据库中不存在该userId";
        public static final String AUTH_NORMAL_EXCEPTION_CODE = "0019";
        public static final String AUTH_NORMAL_EXCEPTION_MSG = "认证异常:";

        // 权限管理状态码
        public static final String AUTH_NULL_USER_ID_CODE = "0030";
        public static final String AUTH_NULL_USER_ID_MSG = "用户id不能为空";
        public static final String AUTH_NULL_ORG_ID_CODE = "0031";
        public static final String AUTH_NULL_ORG_ID_MSG = "机构id不能为空";
        public static final String AUTH_ORG_NOT_FOUND_CODE = "0032";
        public static final String AUTH_ORG_NOT_FOUND_MSG = "机构id不存在";
        public static final String AUTH_ORG_NOT_MATCH_USER_CODE = "0033";
        public static final String AUTH_ORG_NOT_MATCH_USER_MSG = "用户不属于该机构";
        public static final String AUTH_NULL_USERNAME_CODE = "0034";
        public static final String AUTH_NULL_USERNAME_MSG = "用户名不能为空";
        public static final String AUTH_NOT_ADMIN_CODE = "0035";
        public static final String AUTH_NOT_ADMIN_MSG = "非管理员禁止查询该信息";
        public static final String AUTH_NULL_OLD_PASSWD_CODE = "0036";
        public static final String AUTH_NULL_OLD_PASSWD_MSG = "旧密码不能为空";
        public static final String AUTH_NULL_NEW_PASSWD_CODE = "0037";
        public static final String AUTH_NULL_NEW_PASSWD_MSG = "新密码不能为空";
        public static final String AUTH_WRONG_PASSWORD_CODE = "0038";
        public static final String AUTH_WRONG_PASSWORD_MSG = "密码错误";
        public static final String AUTH_NULL_PASSWORD_CODE = "0039";
        public static final String AUTH_NULL_PASSWORD_MSG = "密码不能为空";
        public static final String AUTH_NULL_CN_NAME_CODE = "0040";
        public static final String AUTH_NULL_CN_NAME_MSG = "姓名不能为空";
        public static final String AUTH_USER_ALLREADY_EXISTS_CODE = "0041";
        public static final String AUTH_USER_ALLREADY_EXISTS_MSG = "用户名已存在";
        public static final String AUTH_INVALID_GROUP_IDS_CODE = "0042";
        public static final String AUTH_INVALID_GROUP_IDS_MSG = "下列组 id 不存在 或 不属于当前机构: ";
        public static final String AUTH_INVALID_ROLE_IDS_CODE = "0043";
        public static final String AUTH_INVALID_ROLE_IDS_MSG = "下列角色 id 不存在 或 不属于当前机构: ";
        public static final String AUTH_INVALID_USER_IDS_CODE = "0044";
        public static final String AUTH_INVALID_USER_IDS_MSG = "下列用户 id 不存在 或 不属于当前机构: ";
        public static final String AUTH_AUTHORITY_NOT_FOUND_CODE = "0045";
        public static final String AUTH_AUTHORITY_NOT_FOUND_MSG = "下列权限 id 不存在 或 不属于当前机构: ";
        public static final String AUTH_NULL_ROLE_NAME_CODE = "0046";
        public static final String AUTH_NULL_ROLE_NAME_MSG = "角色名不能为空";
        public static final String AUTH_NULL_ROLE_ID_CODE = "0047";
        public static final String AUTH_NULL_ROLE_ID_MSG = "角色id不能为空";
        public static final String AUTH_NULL_GROUP_NAME_CODE = "0048";
        public static final String AUTH_NULL_GROUP_NAME_MSG = "组名不能为空";
        public static final String AUTH_NULL_GROUP_ID_CODE = "0049";
        public static final String AUTH_NULL_GROUP_ID_MSG = "组id不能为空";
        public static final String AUTH_GROUP_NOT_FOUND_CODE = "0050";
        public static final String AUTH_GROUP_NOT_FOUND_MSG = "组id不存在";
        public static final String AUTH_ORG_NOT_MATCH_GROUP_CODE = "0051";
        public static final String AUTH_ORG_NOT_MATCH_GROUP_MSG = "组不属于当前机构";
        public static final String AUTH_ROLE_NOT_FOUND_CODE = "0052";
        public static final String AUTH_ROLE_NOT_FOUND_MSG = "角色id不存在当前机构";
        public static final String AUTH_ORG_NOT_MATCH_ROLE_CODE = "0053";
        public static final String AUTH_ORG_NOT_MATCH_ROLE_MSG = "角色不属于当前机构";
        public static final String AUTH_NULL_ORG_NAME_CODE = "0054";
        public static final String AUTH_NULL_ORG_NAME_MSG = "机构名不能为空";
        public static final String AUTH_NULL_ADMIN_PASSWD_CODE = "0055";
        public static final String AUTH_NULL_ADMIN_PASSWD_MSG = "管理员密码不能为空";
        public static final String AUTH_ORG_ALREADY_EXIST_CODE = "0056";
        public static final String AUTH_ORG_ALREADY_EXIST_MSG = "机构已存在，无法创建";
        public static final String AUTH_ORG_ADMIN_ALREADY_EXIST_CODE = "0057";
        public static final String AUTH_ORG_ADMIN_ALREADY_EXIST_MSG = "机构所对应的管理员账户已存在，无法创建";
        public static final String AUTH_NULL_AUTHORITY_ID_CODE = "0058";
        public static final String AUTH_NULL_AUTHORITY_ID_MSG = "权限ID不能为空";
        public static final String AUTH_AUTHORITY_ID_NOT_FOUND_CODE = "0059";
        public static final String AUTH_AUTHORITY_ID_NOT_FOUND_MSG = "权限ID不存在";
        public static final String AUTH_ORG_ADMIN_NOT_FOUND_CODE = "0060";
        public static final String AUTH_ORG_ADMIN_NOT_FOUND_MSG = "找不到与该机构同名的管理员账号";
        public static final String AUTH_UNINVALID_ADMIN_CODE = "0061";
        public static final String AUTH_UNINVALID_ADMIN_MSG = "不能添加敏感权限";

        public static final String AUTH_0099_CODE = "0099";
        public static final String AUTH_0099_MSG = "数据库查询异常";


        // 图谱权限
        public static final String AUTH_CAN_NOT_ACCESS_GRAPH_CODE = "0020";
        public static final String AUTH_CAN_NOT_ACCESS_GRAPH_MSG = "没有权限访问该图谱";

        //图谱查询错误状态码
        public static final String GRAPH_REEOR_CODE_1 = "0101";
        public static final String GRAPH_REEOR_CODE_2 = "0102";
        public static final String GRAPH_REEOR_CODE_3 = "0103";
        public static final String GRAPH_REEOR_CODE_4 = "0104";
        public static final String GRAPH_REEOR_CODE_5 = "0105";
        public static final String GRAPH_REEOR_CODE_6 = "0106";
        public static final String GRAPH_REEOR_CODE_7 = "0107";
        public static final String GRAPH_REEOR_CODE_8 = "0108";
        public static final String GRAPH_REEOR_CODE_9 = "0109";
        public static final String GRAPH_REEOR_CODE_10 = "0110";
        public static final String GRAPH_REEOR_CODE_11 = "0111";
        public static final String GRAPH_REEOR_CODE_99 = "0199";
        //图谱查询错误信息
        public static final String GRAPH_REEOR_CODE_1_MSG = "查询点不存在！";
        public static final String GRAPH_REEOR_CODE_2_MSG = "参数解析错误！";
        public static final String GRAPH_REEOR_CODE_3_MSG = "获取点详情信息失败！";
        public static final String GRAPH_REEOR_CODE_4_MSG = "没有找到符合条件的数据！";
        public static final String GRAPH_REEOR_CODE_5_MSG = "获取点列表出现异常！";
        public static final String GRAPH_REEOR_CODE_6_MSG = "获取点详情信息失败！";
        public static final String GRAPH_REEOR_CODE_7_MSG = "删除点失败！";
        public static final String GRAPH_REEOR_CODE_8_MSG = "更新点属性失败！";
        public static final String GRAPH_REEOR_CODE_9_MSG = "图探索方向异常！";
        public static final String GRAPH_REEOR_CODE_10_MSG = "图谱异常！";
        public static final String GRAPH_REEOR_CODE_11_MSG = "图谱请求的实体不能为空！";
        public static final String GRAPH_REEOR_CODE_99_MSG = "未知的异常";
        //最短路径错误状态码
        public static final String SHOUTEST_ROUTE_GRAPH_REEOR_CODE_1 = "0201";
        public static final String SHOUTEST_ROUTE_GRAPH_REEOR_CODE_2 = "0202";
        public static final String SHOUTEST_ROUTE_GRAPH_REEOR_CODE_3 = "0203";
        public static final String SHOUTEST_ROUTE_GRAPH_REEOR_CODE_99 = "0299";
        //最短路径错误信息
        public static final String SHOUTEST_ROUTE_GRAPH_REEOR_CODE_1_MSG = "起始点不存在！";
        public static final String SHOUTEST_ROUTE_GRAPH_REEOR_CODE_2_MSG = "终止点不存在！";
        public static final String SHOUTEST_ROUTE_GRAPH_REEOR_CODE_3_MSG = "参数解析错误！";
        public static final String SHOUTEST_ROUTE_GRAPH_REEOR_CODE_99_MSG = "未知的异常";
        //获取labels错误码
        public static final String LABEL_REEOR_CODE_1 = "0301";
        public static final String LABEL_REEOR_CODE_2 = "0302";
        public static final String LABEL_REEOR_CODE_99 = "0399";
        //获取labels错误信息
        public static final String LABEL_REEOR_CODE_1_MSG = "获取点label失败！";
        public static final String LABEL_REEOR_CODE_2_MSG = "获取边label失败！";
        public static final String LABEL_REEOR_CODE_99_MSG = "未知的异常！";
        //模糊查询接口异常状态码
        public static final String QUERY_REEOR_CODE_1 = "0401";
        //模糊查询接口异常状态信息
        public static final String QUERY_REEOR_CODE_1_MSG = "模糊查询异常！";
        //图设置错误码
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_1 = "0501";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_2 = "0502";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_3 = "0503";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_4 = "0504";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_5 = "0505";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_6 = "0506";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_7 = "0507";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_1_MSG = "数据库查询异常！";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_2_MSG = "保存配置信息异常！";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_3_MSG = "删除失败！";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_4_MSG = "更新失败，更新图谱不存在！";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_5_MSG = "数据库更新失败！";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_6_MSG = "查询图不存在！";
        public static final String GRAPH_CONFIGURATION_REEOR_CODE_7_MSG = "查询图已存在！";
        public static final String GRAPH_CONFIGURATION_CONFIG_ERR_CODE = "0508";
        public static final String GRAPH_CONFIGURATION_CONFIG_ERR_MSG = "图谱数据为空！";
        public static final String GRAPH_CONFIGURATION_NO_DATA_IN_JANUS_ERR_CODE = "0509";
        public static final String GRAPH_CONFIGURATION_NO_DATA_IN_JANUS_ERR_MSG = "当前图谱数据为空";
        public static final String GRAPH_CONFIGURATION_NULL_WHICH_GRAPH_CODE = "0510";
        public static final String GRAPH_CONFIGURATION_NULL_WHICH_GRAPH_MSG = "请求参数中的图谱标识字段为空！";
        public static final String GRAPH_CONFIGURATION_NULL_MODULE_CODE_CODE = "0511";
        public static final String GRAPH_CONFIGURATION_NULL_MODULE_CODE_MSG = "请求参数中的功能应用标识字段为空";
        public static final String GRAPH_CONFIGURATION_NULL_GRAPH_MODULE_CODE = "0512";
        public static final String GRAPH_CONFIGURATION_NULL_GRAPH_MODULE_MSG = "该功能应用不存在";
        //知识建模模块
        public static final String SCHEMA_ERROR_ERROR_PARAM_CODE = "0601";
        public static final String SCHEMA_ERROR_PARENT_NOT_EXIST_CODE = "0602";
        public static final String SCHEMA_ERROR_SAVE_ERROR_CODE = "0603";
        public static final String SCHEMA_ERROR_DATA_NOT_FOUND_CODE = "0604";
        public static final String SCHEMA_ERROR_CONSISTENCY_ERROR_CODE = "0605";
        public static final String SCHEMA_ERROR_DELETE_ERROR_CODE = "0606";
        public static final String SCHEMA_ERROR_CODE_7 = "0607";
        public static final String SCHEMA_ERROR_CODE_8 = "0608";
        public static final String SCHEMA_ERROR_CODE_9 = "0609";
        public static final String SCHEMA_ERROR_CODE_10 = "0610";
        public static final String SCHEMA_ERROR_EDGELABEL_ALREADY_EXIST_CODE = "0611";
        public static final String SCHEMA_ERROR_KEY_ALREADY_EXIST_CODE = "0612";


        public static final String SCHEMA_ERROR_ERROR_PARAM_MSG = "前端传参不完整";
        public static final String SCHEMA_ERROR_PARENT_NOT_EXIST_MSG = "父节点不存在";
        public static final String SCHEMA_ERROR_SAVE_ERROR_MSG = "数据保存失败";
        public static final String SCHEMA_ERROR_DATA_NOT_FOUND_MSG = "找不到此id对应的数据";
        public static final String SCHEMA_ERROR_CONSISTENCY_ERROR_MSG = "数据一致性出现问题";
        public static final String SCHEMA_ERROR_DELETE_ERROR_MSG = "删除失败";
        public static final String SCHEMA_ERROR_MSG_7 = "父节点中已存在该属性";
        public static final String SCHEMA_ERROR_MSG_8 = "子节点中已存在该属性";
        public static final String SCHEMA_ERROR_MSG_9 = "该节点已存在该属性";
        public static final String SCHEMA_ERROR_MSG_10 = "该节点的消歧标识重复";
        public static final String SCHEMA_ERROR_EDGELABEL_ALREADY_EXIST_MSG = "关系定义已经存在";
        public static final String SCHEMA_ERROR_KEY_ALREADY_EXIST_MSG = "属性定义已经存在";


        // 数据集管理模块

        public static final String DATASET_REQ_PARAM_ERR_CODE = "0701";
        public static final String DATASET_REQ_PARAM_ERR_MSG = "请求参数不全";
        public static final String DATASET_SAVE_TO_DATABASE_CODE = "0702";
        public static final String DATASET_SAVE_TO_DATABASE_MSG = "数据库保存失败";
        public static final String DATASET_READ_DATABASE_CODE = "0703";
        public static final String DATASET_READ_DATABASE_MSG = "数据库查询异常";
        public static final String DATASET_NO_DATASOURCE_BY_ID_CODE = "0704";
        public static final String DATASET_NO_DATASOURCE_BY_ID_MSG = "此sourceId无对应的数据源";
        public static final String DATASET_GET_TABLE_LIST_CODE = "0705";
        public static final String DATASET_GET_TABLE_LIST_MSG = "获取表名异常";
        public static final String DATASET_NULL_BY_ID_CODE = "0706";
        public static final String DATASET_NULL_BY_ID_MSG = "此dataSetId无对应的数据源";
        public static final String DATASET_DELETE_DATABASE_CODE = "0707";
        public static final String DATASET_DELETE_DATABASE_MSG = "数据库删除异常";
        public static final String DATASET_NULL_DATASOURCE_CODE = "0708";
        public static final String DATASET_NULL_DATASOURCE_MSG = "此数据集无对应的数据源";
        public static final String DATASET_GET_TABLE_COLUMNS_CODE = "0709";
        public static final String DATASET_GET_TABLE_COLUMNS_MSG = "获取列名异常";
        public static final String DATASET_NO_FIELDS_BY_ID_CODE = "0710";
        public static final String DATASET_NO_FIELDS_BY_ID_MSG = "此dataSetId无对应的字段列表";
        public static final String DATASET_NAME_ALREADY_EXISTS_CODE = "0711";
        public static final String DATASET_NAME_ALREADY_EXISTS_MSG = "dataSet的名称已存在";
        public static final String DATASET_CODE_ALREADY_EXISTS_CODE = "0712";
        public static final String DATASET_CODE_ALREADY_EXISTS_MSG = "dataSet的标识已存在";
        public static final String DATASET_MODULE_NULL_TABLENAME_CODE = "0713";
        public static final String DATASET_MODULE_NULL_TABLENAME_MSG = "数据表输入模块的表名未传";
        public static final String DATASET_MODULE_NULL_SOURCENAME_CODE = "0714";
        public static final String DATASET_MODULE_NULL_SOURCENAME_MSG = "数据表输入模块的数据源名称未传";
        public static final String DATASET_MODULE_NULL_SOURCEDETAIL_CODE = "0715";
        public static final String DATASET_MODULE_NULL_SOURCEDETAIL_MSG = "数据源不存在";
        public static final String DATASET_MODULE_CHART_ERROR_CODE = "0716";
        public static final String DATASET_MODULE_CHART_ERROR_MSG = "流程图参数错误";
        public static final String DATASET_MODULE_NO_FIELDS_IN_OUTPUT_MODULE_CODE = "0717";
        public static final String DATASET_MODULE_NO_FIELDS_IN_OUTPUT_MODULE_MSG = "输出模块未配置字段信息";
        public static final String DATASET_MODULE_NO_DATA_SET_FIELD_CODE = "0718";
        public static final String DATASET_MODULE_NO_DATA_SET_FIELD_MSG = "未找到该字段相关信息，请检查映射配置";
        public static final String DATASET_MODULE_DUMP_OUTPUT_CODE = "0719";
        public static final String DATASET_MODULE_DUMP_OUTPUT_MSG = "一个流程图只允许一个输出控件";

        public static final String DATASET_ERROR_CODE_99 = "0799";
        public static final String DATASET_ERROR_CODE_99_MSG = "未知的异常！";

        // 图谱管理模块
        public static final String GRAPH_MANAGER_ERROR_CODE_99 = "0899";
        public static final String GRAPH_MANAGER_ERROR_CODE_99_MSG = "未知的异常！";
        public static final String GRAPH_MANAGER_GRAPH_NOT_EXIST_CODE = "0801";
        public static final String GRAPH_MANAGER_GRAPH_NOT_EXIST_MSG = "图谱不存在！";
        public static final String GRAPH_MANAGER_EXIST_IN_JANUS_CODE = "0802";
        public static final String GRAPH_MANAGER_EXIST_IN_JANUS_MSG = "图谱已存在janusGraph中！";
        public static final String GRAPH_MANAGER_WRONG_REQ_ERROR_CODE = "0803";
        public static final String GRAPH_MANAGER_WRONG_REQ_ERROR_MSG = "请求值有问题！";
        public static final String GRAPH_MANAGER_FAIL_CREATE_IN_JANUS_CODE = "0804";
        public static final String GRAPH_MANAGER_FAIL_CREATE_IN_JANUS_MSG = "图谱创建失败";
        public static final String GRAPH_MANAGER_CLOSE_GRAPH_FAIL_CODE = "0805";
        public static final String GRAPH_MANAGER_CLOSE_GRAPH_FAIL_MSG = "图谱删除失败";
        public static final String GRAPH_MANAGER_GRAPH_IS_CREATING_CODE = "0806";
        public static final String GRAPH_MANAGER_GRAPH_IS_CREATING_MSG = "图谱正在创建中，请稍后再试！";
        public static final String GRAPH_MANAGER_NO_GRAPH_PROPERTIES_CODE = "0807";
        public static final String GRAPH_MANAGER_NO_GRAPH_PROPERTIES_MSG = "数据库中未找到图谱配置信息！";
        public static final String GRAPH_MANAGER_NO_USER_BY_ID_CODE = "0808";
        public static final String GRAPH_MANAGER_ERROR_NO_USER_BY_ID_MSG = "当前用户Id不存在！";
        public static final String GRAPH_MANAGER_NO_DEFAULT_GRAPH_CODE = "0809";
        public static final String GRAPH_MANAGER_NO_DEFAULT_GRAPH_MSG = "当前用户未绑定默认图谱！";
        public static final String GRAPH_MANAGER_SAVE_GRAPH_CODE = "0810";
        public static final String GRAPH_MANAGER_SAVE_GRAPH_MSG = "保存Graph失败";
        public static final String GRAPH_MANAGER_SAVE_GRAPH_PROPERTIES_CODE = "0811";
        public static final String GRAPH_MANAGER_SAVE_GRAPH_PROPERTIES_MSG = "保存GraphProperties失败";
        public static final String GRAPH_MANAGER_EXIST_IN_DB_CODE = "0812";
        public static final String GRAPH_MANAGER_EXIST_IN_DB_MSG = "图谱已存在DB中";
        public static final String GRAPH_MANAGER_READ_DB_ERROR_CODE = "0813";
        public static final String GRAPH_MANAGER_READ_DB_ERROR_MSG = "数据库查询失败";
        public static final String GRAPH_MANAGER_UPDATE_DB_ERROR_CODE = "0814";
        public static final String GRAPH_MANAGER_UPDATE_DB_ERROR_MSG = "数据库更新失败";
        public static final String GRAPH_MANAGER_NO_MODULE_CODE = "0815";
        public static final String GRAPH_MANAGER_NO_MODULE_MSG = "没有此功能地图模块";
        public static final String GRAPH_MANAGER_EXIST_MODULE_CODE = "0816";
        public static final String GRAPH_MANAGER_EXIST_MODULE_MSG = "此功能地图模块已经存在";
        public static final String GRAPH_MANAGER_MODULE_CONFIG_ERR_CODE = "0817";
        public static final String GRAPH_MANAGER_MODULE_CONFIG_ERR_MSG = "传入的配置信息与功能地图模块不符";
        public static final String GRAPH_MANAGER_EXIST_NOT_IN_DB_CODE = "0818";
        public static final String GRAPH_MANAGER_EXIST_NOT_IN_DB_MSG = "图谱不存在DB中，请先在DB中添加图谱";
        public static final String GRAPH_MANAGER_GRAPH_NAME_EXIST_IN_DB_CODE = "0819";
        public static final String GRAPH_MANAGER_GRAPH_NAME_EXIST_IN_DB_MSG = "新的graphName在DB中已存在";
        public static final String GRAPH_MANAGER_GET_GRAPH_TRAVERSAL_CODE = "0820";
        public static final String GRAPH_MANAGER_GET_GRAPH_TRAVERSAL_MSG = "获取图谱的traversal失败";
        public static final String GRAPH_MANAGER_OPEN_GRAPH_FAIL_CODE = "0821";
        public static final String GRAPH_MANAGER_OPEN_GRAPH_FAIL_MSG = "获取图谱实例失败";
        public static final String GRAPH_MANAGER_WHICH_GRAPH_NULL_CODE = "0822";
        public static final String GRAPH_MANAGER_WHICH_GRAPH_NULL_MSG = "图谱标识不能为空";
        public static final String GRAPH_MANAGER_GRAPH_NAME_NULL_CODE = "0823";
        public static final String GRAPH_MANAGER_GRAPH_NAME_NULL_MSG = "图谱名称不能为空";
        public static final String GRAPH_MANAGER_GRAPH_AUTH_NULL_CODE = "0824";
        public static final String GRAPH_MANAGER_GRAPH_AUTH_NULL_MSG = "图谱权限不能为空";
        public static final String GRAPH_MANAGER_GRAPH_TYPE_NULL_CODE = "0825";
        public static final String GRAPH_MANAGER_GRAPH_TYPE_NULL_MSG = "图谱类型不能为空";
        public static final String GRAPH_MANAGER_GRAPH_MODE_NULL_CODE = "0826";
        public static final String GRAPH_MANAGER_GRAPH_MODE_NULL_MSG = "图谱模式不能为空";
        public static final String GRAPH_MANAGER_DELETE_GRAPH_FAIL_CODE = "0827";
        public static final String GRAPH_MANAGER_DELETE_GRAPH_FAIL_MSG = "删除/清空图谱失败";
        public static final String GRAPH_MANAGER_DELETE_ID_MAP_CODE = "0828";
        public static final String GRAPH_MANAGER_DELETE_ID_MAP_MSG = "删除idMap失败";
        public static final String GRAPH_DOC_TYPE_ERROR_CORD = "0829";
        public static final String GRAPH_DOC_TYPE_ERROR_MSG = "请先设计并同步图谱模式!";
        public static final String GRAPH_MANAGER_EXIST_NOT_IN_JANUS_CODE = "0830";
        public static final String GRAPH_MANAGER_EXIST_NOT_IN_JANUS_MSG = "图谱不存在图数据库中，请先在图数据库中添加图谱";

        // 数据源管理
        public static final String DATA_SOURCE_TEST_ERROR_CODE = "0901";
        public static final String DATA_SOURCE_TEST_ERROR_MSG = "数据库连接失败，请检查配置信息";
        public static final String DATA_SOURCE_UPLOAD_FILE_FAILED_CODE = "0902";
        public static final String DATA_SOURCE_UPLOAD_FILE_FAILED_MSG = "文件上传失败";
        public static final String DATA_SOURCE_NO_SOURCE_TYPE_CODE = "0903";
        public static final String DATA_SOURCE_NO_SOURCE_TYPE_MSG = "请求参数没有sourceType";
        public static final String DATA_SOURCE_UPDATE_DATA_CODE = "0904";
        public static final String DATA_SOURCE_UPDATE_DATA_MSG = "数据库更新失败";
        public static final String DATA_SOURCE_READ_DATA_CODE = "0905";
        public static final String DATA_SOURCE_READ_DATA_MSG = "数据库查询异常";
        public static final String DATA_SOURCE_ADD_EXCEL_OR_SQLITE_CODE = "0906";
        public static final String DATA_SOURCE_ADD_EXCEL_OR_SQLITE_MSG = "添加excel/csv或sqlite数据源，需要传文件id和名称";
        public static final String DATA_SOURCE_REQ_PARAM_CODE = "0907";
        public static final String DATA_SOURCE_REQ_PARAM_MSG = "请求参数有问题";
        public static final String DATA_SOURCE_UPLOAD_HDFS_CODE = "0908";
        public static final String DATA_SOURCE_UPLOAD_HDFS_MSG = "文件上传到HDFS失败";
        public static final String DATA_SOURCE_NULL_FILE_CODE = "0909";
        public static final String DATA_SOURCE_NULL_FILE_MSG = "添加数据源上传的文件不能为空";
        public static final String DATA_SOURCE_NULL_CSV_COLUMNS_CODE = "0910";
        public static final String DATA_SOURCE_NULL_CSV_COLUMNS_MSG = "添加CSV数据源时字段不能为空";
        public static final String DATA_SOURCE_NULL_CSV_DELIMITER_CODE = "0911";
        public static final String DATA_SOURCE_NULL_CSV_DELIMITER_MSG = "添加CSV数据源时分隔符不能为空";
        public static final String DATA_SOURCE_NAME_EXISTS_CODE = "0912";
        public static final String DATA_SOURCE_NAME_EXISTS_MSG = "添加数据源的名称不能重复";
        public static final String DATA_SOURCE_PARSE_CSV_HEADERS_CODE = "0913";
        public static final String DATA_SOURCE_PARSE_CSV_HEADERS_MSG = "获取csv的表头异常";
        public static final String DATA_SOURCE_DUP_CSV_HEADERS_CODE = "0914";
        public static final String DATA_SOURCE_DUP_CSV_HEADERS_MSG = "csv的表头存在重复字段";
        public static final String DATA_SOURCE_NO_SOURCE_NAME_CODE = "0915";
        public static final String DATA_SOURCE_NO_SOURCE_NAME_MSG = "请求参数没有sourceName";
        public static final String DATA_SOURCE_NULL_TRIPLE_FILE_CODE = "0916";
        public static final String DATA_SOURCE_NULL_TRIPLE_FILE_MSG = "添加三元组数据源时上传文件的Id不能为空";
        public static final String DATA_SOURCE_NULL_SOURCE_DETAIL_CODE = "0917";
        public static final String DATA_SOURCE_NULL_SOURCE_DETAIL_MSG = "该Id对应的数据源不存在";
        public static final String DATA_SOURCE_NULL_UPLOAD_TRIPLE_FILE_CODE = "0918";
        public static final String DATA_SOURCE_NULL_UPLOAD_TRIPLE_FILE_MSG = "创建三元组数据源文件上传不能为空";
        public static final String DATA_SOURCE_PREVIEW_SOURCE_TYPE_NULL_CODE = "0919";
        public static final String DATA_SOURCE_PREVIEW_SOURCE_TYPE_NULL_MSG = "数据预览时sourceType字段不能为空";
        public static final String DATA_SOURCE_PREVIEW_ERROR_CODE = "0920";
        public static final String DATA_SOURCE_PREVIEW_ERROR_MSG = "数据预览失败";
        public static final String DATA_SOURCE_PREVIEW_HOST_NULL_CODE = "0921";
        public static final String DATA_SOURCE_PREVIEW_HOST_NULL_MSG = "数据预览时数据库的host不能为空";
        public static final String DATA_SOURCE_PREVIEW_PORT_NULL_CODE = "0922";
        public static final String DATA_SOURCE_PREVIEW_PORT_NULL_MSG = "数据预览时数据库的port不能为空";
        public static final String DATA_SOURCE_PREVIEW_DB_NULL_CODE = "0923";
        public static final String DATA_SOURCE_PREVIEW_DB_NULL_MSG = "数据预览时数据库的名称不能为空";
        public static final String DATA_SOURCE_PREVIEW_USERNAME_NULL_CODE = "0924";
        public static final String DATA_SOURCE_PREVIEW_USERNAME_NULL_MSG = "数据预览时数据库的用户名不能为空";
        public static final String DATA_SOURCE_PREVIEW_PASSWD_NULL_CODE = "0925";
        public static final String DATA_SOURCE_PREVIEW_PASSWD_NULL_MSG = "数据预览时数据库的密码不能为空";
        public static final String DATA_SOURCE_PREVIEW_QUORUM_NULL_CODE = "0926";
        public static final String DATA_SOURCE_PREVIEW_QUORUM_NULL_MSG = "数据预览时数据库的quorum不能为空";
        public static final String DATA_SOURCE_PREVIEW_CLIENT_PORT_NULL_CODE = "0927";
        public static final String DATA_SOURCE_PREVIEW_CLIENT_PORT_NULL_MSG = "数据预览时数据库的clientPort不能为空";
        public static final String DATA_SOURCE_PREVIEW_FILE_ID_NULL_CODE = "0928";
        public static final String DATA_SOURCE_PREVIEW_FILE_ID_NULL_MSG = "数据预览时数据库的fileId不能为空";
        public static final String DATA_SOURCE_PREVIEW_TRIPLE_FILE_ID_NULL_CODE = "0929";
        public static final String DATA_SOURCE_PREVIEW_TRIPLE_FILE_ID_NULL_MSG = "数据预览时数据库的三元组fileId不能为空";
        public static final String DATA_SOURCE_READ_CSV_CODE = "0930";
        public static final String DATA_SOURCE_READ_CSV_MSG = "读取csv数据异常";
        public static final String DATA_SOURCE_NOT_SUPPORT_CODE = "0931";
        public static final String DATA_SOURCE_NOT_SUPPORT_MSG = "该数据源尚未支持";
        public static final String DATA_SOURCE_PREVIEW_NULL_TABLENAME_CODE = "0932";
        public static final String DATA_SOURCE_PREVIEW_NULL_TABLENAME_MSG = "数据预览时表名称不能为空";
        public static final String DATA_SOURCE_PREVIEW_GET_TABLENAMES_CODE = "0933";
        public static final String DATA_SOURCE_PREVIEW_GET_TABLENAMES_MSG = "获取数据表列表失败";

        public static final String DATA_SOURCE_ERROR_CODE_99 = "0999";
        public static final String DATA_SOURCE_ERROR_CODE_99_MSG = "未知的异常";

        //三元组对图谱数据的操作
        public static final String GRAPH_EDIT_MISS_REQUEST_VALUE_CODE = "1001";
        public static final String GRAPH_EDIT_OPERATER_GRAPH_FAIL_CODE = "1002";
        public static final String GRAPH_EDIT_MISS_TRAVERSAL_CODE = "1003";
        public static final String GRAPH_EDIT_SEARCH_ERROR_CODE = "1004";
        public static final String GRAPH_EDIT_INDEX_MISS_CODE = "1005";
        public static final String GRAPH_EDIT_LABEL_MISS_CODE = "1006";
        public static final String GRAPH_EDIT_MISS_DATA_IN_GRAPH_CODE = "1007";
        public static final String GRAPH_EDIT_MERGEING_CODE = "1008";


        public static final String GRAPH_EDIT_MISS_REQUEST_VALUE_MSG = "缺少请求值";
        public static final String GRAPH_EDIT_OPERATER_GRAPH_FAIL_MSG = "图谱操作失败";
        public static final String GRAPH_EDIT_MISS_TRAVERSAL_MSG = "没有找到图谱";
        public static final String GRAPH_EDIT_SEARCH_ERROR_MSG = "搜索异常";
        public static final String GRAPH_EDIT_INDEX_MISS_MSG = "索引丢失";
        public static final String GRAPH_EDIT_LABEL_MISS_MSG = "传入的过滤label在数据库里找不到";
        public static final String GRAPH_EDIT_MISS_DATA_IN_GRAPH_MSG = "在对应图谱里面没有找到对应的数据";
        public static final String GRAPH_EDIT_MERGEING_MSG = "合并实体任务正在进行,无法执行更新操作";

        // 搜索模块
        public static final String SEARCH_ERROR_CODE = "1101";
        public static final String SEARCH_ERROR_MSG = "搜索异常";

        // 标注模块
        public static final String ANNOTATION_REQ_PARAM_CODE = "1201";
        public static final String ANNOTATION_READ_DATA_CODE = "1202";
        public static final String ANNOTATION_VERTEX_NOT_EXIST_CODE = "1203";
        public static final String ANNOTATION_UPDATE_DATA_CODE = "1204";
        public static final String ANNOTATION_NULL_OFFSET_OF_PAGE_CODE = "1205";
        public static final String ANNOTATION_VERTEX_KEY_NOT_EXIST_CODE = "1206";
        public static final String ANNOTATION_WHICHGRAPH_NOT_CONSISTENT_CODE = "1207";
        public static final String ANNOTATION_EDGE_NOT_EXIST_CODE = "1208";
        public static final String ANNOTATION_EDGE_KEY_NOT_EXIST_CODE = "1209";
        public static final String ANNOTATION_REQ_PARAM_MSG = "请求值有问题！";
        public static final String ANNOTATION_READ_DATA_MSG = "数据库查询异常！";
        public static final String ANNOTATION_VERTEX_NOT_EXIST_MSG = "实体类型不存在！";
        public static final String ANNOTATION_UPDATE_DATA_MSG = "数据库更新异常！";
        public static final String ANNOTATION_NULL_OFFSET_OF_PAGE_MSG = "offset所在页数不存在！";
        public static final String ANNOTATION_VERTEX_KEY_NOT_EXIST_MSG = "实体属性类型不存在！";
        public static final String ANNOTATION_WHICHGRAPH_NOT_CONSISTENT_MSG = "当前标注任务所属图谱和添加内容的所属图谱不一致！";
        public static final String ANNOTATION_EDGE_NOT_EXIST_MSG = "关系类型不存在！";
        public static final String ANNOTATION_EDGE_KEY_NOT_EXIST_MSG = "关系属性类型不存在！";


        public static final String ANNOTATION_LIST_TASK_CODE = "1210";
        public static final String ANNOTATION_LIST_TASK_MSG = "查找标注任务列表发生异常";
        public static final String ANNOTATION_NULL_GRAPH_CODE = "1211";
        public static final String ANNOTATION_NULL_GRAPH_MSG = "标注任务必须指定whichGraph";
        public static final String ANNOTATION_NULL_FILE_CODE = "1212";
        public static final String ANNOTATION_NULL_FILE_MSG = "标注任务的源文件不能为空";
        public static final String ANNOTATION_NULL_ANNOTATOR_CODE = "1213";
        public static final String ANNOTATION_NULL_ANNOTATOR_MSG = "标注任务的必须指定至少一个标注人";
        public static final String ANNOTATION_NULL_REVIEWER_CODE = "1214";
        public static final String ANNOTATION_NULL_REVIEWER_MSG = "标注任务的必须指定至少一个审核人";
        public static final String ANNOTATION_USER_ID_FORMAT_CODE = "1215";
        public static final String ANNOTATION_USER_ID_FORMAT_MSG = "userId 不是一个数字";
        public static final String ANNOTATION_CREATE_TASK_CODE = "1216";
        public static final String ANNOTATION_CREATE_TASK_MSG = "创建标注任务失败";
        public static final String ANNOTATION_TASK_NULL_ID_CODE = "1217";
        public static final String ANNOTATION_TASK_NULL_ID_MSG = "标注任务id不能为空";
        public static final String ANNOTATION_TASK_NOT_EXIST_CODE = "1218";
        public static final String ANNOTATION_TASK_NOT_EXIST_MSG = "标注任务不存在";
        public static final String ANNOTATION_DELETE_TASK_FAIL_CODE = "1219";
        public static final String ANNOTATION_DELETE_TASK_FAIL_MSG = "删除标注任务失败";


        public static final String ANNOTATION_FILE_PAGE_ARGS_NULL_CODE = "1220";
        public static final String ANNOTATION_FILE_PAGE_ARGS_NULL_MSG = "标注任务ID/源文件页码 皆不能为空";
        public static final String ANNOTATION_FILE_NO_SUCH_PAGE_CODE = "1221";
        public static final String ANNOTATION_FILE_NO_SUCH_PAGE_MSG = "源文件没有请求的页数";
        public static final String ANNOTATION_FILE_NO_ANY_PAGE_CODE = "1222";
        public static final String ANNOTATION_FILE_NO_ANY_PAGE_MSG = "源文件未完成预分页或没有分页信息";
        public static final String ANNOTATION_FILE_PAGE_NOT_EXIST_CODE = "1223";
        public static final String ANNOTATION_FILE_PAGE_NOT_EXIST_MSG = "源文件分页查询异常，没有查询到数据";
        public static final String ANNOTATION_FILE_PAGE_QUERY_ERR_CODE = "1224";
        public static final String ANNOTATION_FILE_PAGE_QUERY_ERR_MSG = "查询源文件分页发生数据库异常";
        public static final String ANNOTATION_VERTEX_QUERY_ERR_CODE = "1225";
        public static final String ANNOTATION_VERTEX_QUERY_ERR_MSG = "查询已标注的实体列表时发生数据库异常";
        public static final String ANNOTATION_VERTEX_KEY_QUERY_ERR_CODE = "1226";
        public static final String ANNOTATION_VERTEX_KEY_QUERY_ERR_MSG = "查询已标注的实体属性列表时发生数据库异常";
        public static final String ANNOTATION_EDGE_QUERY_ERR_CODE = "1227";
        public static final String ANNOTATION_EDGE_QUERY_ERR_MSG = "查询已标注的关系列表时发生数据库异常";
        public static final String ANNOTATION_EDGE_KEY_QUERY_ERR_CODE = "1228";
        public static final String ANNOTATION_EDGE_KEY_QUERY_ERR_MSG = "查询已标注的关系属性列表时发生数据库异常";
        public static final String ANNOTATION_OBJECT_NULL_ID_CODE = "1229";
        public static final String ANNOTATION_OBJECT_NULL_ID_MSG = "标注内容的id不能为空";
        public static final String ANNOTATION_OBJECT_DELETE_ERR_CODE = "1230";
        public static final String ANNOTATION_OBJECT_DELETE_ERR_MSG = "删除标注内容失败";
        public static final String ANNOTATION_OBJECT_NOT_EXIST_CODE = "1231";
        public static final String ANNOTATION_OBJECT_NOT_EXIST_MSG = "标注内容不存在";

        public static final String ANNOTATION_FAIL_TO_CSV_CODE = "1232";
        public static final String ANNOTATION_FAIL_TO_CSV_MSG = "标注到csv模板失败";
        public static final String ANNOTATION_FAIL_TO_DELETEGRAPH_CODE = "1233";
        public static final String ANNOTATION_FAIL_TO_DELETEGRAPH_MSG = "删除已有的图失败";


        public static final String ANNOTATION_IMPORT_TASK_FAIL_CODE = "1234";
        public static final String ANNOTATION_IMPORT_TASK_FAIL_MSG = "标注任务状态为空";

        public static final String ANNOTATION_IMPORT_STATUS_FAIL_CODE = "1235";
        public static final String ANNOTATION_IMPORT_STATUS_FAIL_MSG = "传入的标注任务状态错误";

        public static final String ANNOTATION_IMPORT_POST_TASK_FAIL_CODE = "1236";
        public static final String ANNOTATION_IMPORT_POST_TASK_FAIL_MSG = "标注任务导入图谱请求kgflow异常";

        public static final String ANNOTATION_IMPORT_TASK_LOADING_CODE = "1237";
        public static final String ANNOTATION_IMPORT_TASK_LOADING_MSG = "标注任务导入图谱任务正在执行";

        public static final String ANNOTATION_OBJECT_NULL_INDEX_CODE = "1238";
        public static final String ANNOTATION_OBJECT_NULL_INDEX_MSG = "创建/更新标注时的偏移量不能为空";
        public static final String ANNOTATION_OBJECT_NULL_LABEL_ID_CODE = "1239";
        public static final String ANNOTATION_OBJECT_NULL_LABEL_ID_MSG = "创建/更新标注时的类型id不能为空";
        public static final String ANNOTATION_OBJECT_NULL_CONTENT_CODE = "1240";
        public static final String ANNOTATION_OBJECT_NULL_CONTENT_MSG = "创建/更新标注时的内容不能为空";
        public static final String ANNOTATION_OBJECT_NULL_TASK_ID_CODE = "1241";
        public static final String ANNOTATION_OBJECT_NULL_TASK_ID_MSG = "创建/更新标注时的任务id不能为空";
        public static final String ANNOTATION_SAVE_VERTEX_CODE = "1242";
        public static final String ANNOTATION_SAVE_VERTEX_MSG = "保存/更新实体标注失败";
        public static final String ANNOTATION_OBJECT_NULL_VERTEX_KEY_ID_CODE = "1243";
        public static final String ANNOTATION_OBJECT_NULL_VERTEX_KEY_ID_MSG = "创建/更新实体属性标注时的属性类型id不能为空";
        public static final String ANNOTATION_OBJECT_NULL_VERTEX_ID_CODE = "1244";
        public static final String ANNOTATION_OBJECT_NULL_VERTEX_ID_MSG = "创建/更新实体属性标注时的标注实体id不能为空";
        public static final String ANNOTATION_SAVE_VERTEX_KEY_CODE = "1245";
        public static final String ANNOTATION_SAVE_VERTEX_KEY_MSG = "保存/更新实体属性标注失败";
        public static final String ANNOTATION_OBJECT_NULL_EDGE_SOURCE_ID_CODE = "1246";
        public static final String ANNOTATION_OBJECT_NULL_EDGE_SOURCE_ID_MSG = "创建/更新关系标注时的起始实体id不能为空";
        public static final String ANNOTATION_OBJECT_NULL_EDGE_TARGET_ID_CODE = "1247";
        public static final String ANNOTATION_OBJECT_NULL_EDGE_TARGET_ID_MSG = "创建/更新关系标注时的结束实体id不能为空";
        public static final String ANNOTATION_SAVE_EDGE_CODE = "1248";
        public static final String ANNOTATION_SAVE_EDGE_MSG = "保存/更新关系标注失败";
        public static final String ANNOTATION_OBJECT_NULL_EDGE_KEY_ID_CODE = "1249";
        public static final String ANNOTATION_OBJECT_NULL_EDGE_KEY_ID_MSG = "创建/更新关系属性标注时的属性类型id不能为空";
        public static final String ANNOTATION_OBJECT_NULL_EDGE_ID_CODE = "1250";
        public static final String ANNOTATION_OBJECT_NULL_EDGE_ID_MSG = "创建/更新关系属性标注时的标注关系id不能为空";
        public static final String ANNOTATION_SAVE_EDGE_KEY_CODE = "1251";
        public static final String ANNOTATION_SAVE_EDGE_KEY_MSG = "保存/更新关系属性标注失败";
        public static final String ANNOTATION_OBJECT_NULL_CATALOG_ID_CODE = "1252";
        public static final String ANNOTATION_OBJECT_NULL_CATALOG_ID_MSG = "创建树状图实体标注的目录id不能为空";
        public static final String ANNOTATION_UPDATE_LATE_CODE = "1253";
        public static final String ANNOTATION_UPDATE_LATE_MSG = "更新标注操作过时";
        public static final String ANNOTATION_CATALOG_NULL_TASK_ID_CODE = "1254";
        public static final String ANNOTATION_CATALOG_NULL_TASK_ID_MSG = "创建/更新目录时任务id不能为空";
        public static final String ANNOTATION_CATALOG_NULL_NAME_CODE = "1255";
        public static final String ANNOTATION_CATALOG_NULL_NAME_MSG = "创建/更新目录时目录名称不能为空";
        public static final String ANNOTATION_CATALOG_NULL_CODE = "1256";
        public static final String ANNOTATION_CATALOG_NULL_MSG = "该id指定的目录不存在";
        public static final String ANNOTATION_CATALOG_SAVE_CODE = "1257";
        public static final String ANNOTATION_CATALOG_SAVE_MSG = "保存/更新目录失败";
        public static final String ANNOTATION_CATALOG_UPDATE_ID_NULL_CODE = "1258";
        public static final String ANNOTATION_CATALOG_UPDATE_ID_NULL_MSG = "更新目录时id不能为空";
        public static final String ANNOTATION_CATALOG_UPDATE_LATE_CODE = "1259";
        public static final String ANNOTATION_CATALOG_UPDATE_LATE_MSG = "删除/更新目录操作过时";
        public static final String ANNOTATION_CATALOG_DELETE_FAILED_CODE = "1260";
        public static final String ANNOTATION_CATALOG_DELETE_FAILED_MSG = "删除目录失败";
        public static final String ANNOTATION_UPDATE_STATUS_LATE_CODE = "1261";
        public static final String ANNOTATION_UPDATE_STATUS_LATE_MSG = "更新审核操作过时";
        public static final String ANNOTATION_DELETE_LATE_CODE = "1262";
        public static final String ANNOTATION_DELETE_LATE_MSG = "删除操作过时";
        public static final String ANNOTATION_CANT_CREATE_FILE_CODE = "1263";
        public static final String ANNOTATION_CANT_CREATE_FILE_MSG = "文档转换时无法创建文件目录";
        public static final String ANNOTATION_CANT_PROCESS_FILE_CODE = "1264";
        public static final String ANNOTATION_CANT_PROCESS_FILE_MSG = "文档转换失败";
        public static final String ANNOTATION_CANT_DOWNLOAD_UNSTRUCTDATA_CODE = "1265";
        public static final String ANNOTATION_CANT_DOWNLOAD_UNSTRUCTDATA_MSG = "下载非结构过数据失败";


        // 构建任务
        public static final String BUILD_TASK_NO_APP_ID_CODE = "1301";
        public static final String BUILD_TASK_NO_APP_ID_MSG = "构建任务的flowGroupId为空";
        public static final String BUILD_TASK_NULL_ID_CODE = "1302";
        public static final String BUILD_TASK_NULL_ID_MSG = "构建任务的 id 不能为空";
        public static final String BUILD_TASK_NOT_FOUND_CODE = "1302";
        public static final String BUILD_TASK_NOT_FOUND_MSG = "构建任务不存在";
        public static final String BUILD_TASK_NOT_MATCH_ORG_CODE = "1303";
        public static final String BUILD_TASK_NOT_MATCH_ORG_MSG = "构建任务不属于当前机构";
        public static final String BUILD_TASK_CREATE_FAIL_CODE = "1304";
        public static final String BUILD_TASK_CREATE_FAIL_MSG = "构建任务创建失败";
        public static final String BUILD_TASK_NULL_START_LINE_CODE = "1305";
        public static final String BUILD_TASK_NULL_START_LINE_MSG = "StartLine 不能为空";
        public static final String BUILD_TASK_START_LINE_OUT_OF_BOUND_CODE = "1306";
        public static final String BUILD_TASK_START_LINE_OUT_OF_BOUND_MSG = "不支持10000行以外日志的深分页查询, startLine [-10000,10000)";
        public static final String BUILD_TASK_ES_SEARCH_FAIL_CODE = "1306";
        public static final String BUILD_TASK_ES_SEARCH_FAIL_MSG = "日志查询失败";
        public static final String BUILD_TASK_WHICHGRAPH_ERROR_CODE = "1308";
        public static final String BUILD_TASK_WHICHGRAPH_ERROR_MSG = "找不到数据库的whichgraph";
        public static final String BUILD_TASK_SAVE_ERROR_CODE = "1309";
        public static final String BUILD_TASK_SAVE_ERROR_MSG = "数据库保存异常";

        // 三元组导入导出
        public static final String THREE_TUPLE_DOWNLOAD_ADDRESS_NULL_CODE = "1401";
        public static final String THREE_TUPLE_DOWNLOAD_ADDRESS_NULL_MSG = "下载地址不能为空";
        public static final String THREE_TUPLE_DOWNLOAD_FILE_NOT_EXIST_CODE = "1402";
        public static final String THREE_TUPLE_DOWNLOAD_FILE_NOT_EXIST_MSG = "下载文件不存在";
        public static final String THREE_TUPLE_DOWNLOAD_FILE_CODE = "1403";
        public static final String THREE_TUPLE_DOWNLOAD_FILE_MSG = "文件下载异常";
        public static final String THREE_TUPLE_WHICH_GRAPH_NULL_CODE = "1404";
        public static final String THREE_TUPLE_WHICH_GRAPH_NULL_MSG = "图谱标识不能为空";
        public static final String THREE_TUPLE_UPLOAD_FILE_NULL_CODE = "1405";
        public static final String THREE_TUPLE_UPLOAD_FILE_NULL_MSG = "上传的文件不能为空";
        public static final String THREE_TUPLE_UPLOAD_FILE_FAIL_CODE = "1406";
        public static final String THREE_TUPLE_UPLOAD_FILE_FAIL_MSG = "文件上传失败";
        public static final String THREE_TUPLE_SAVE_DB_FAIL_CODE = "1407";
        public static final String THREE_TUPLE_SAVE_DB_FAIL_MSG = "数据库保存失败";
        public static final String THREE_TUPLE_READ_DB_FAIL_CODE = "1408";
        public static final String THREE_TUPLE_READ_DB_FAIL_MSG = "数据库读取失败";
        public static final String THREE_TUPLE_USER_NO_PATH_CODE = "1409";
        public static final String THREE_TUPLE_USER_NO_PATH_MSG = "当前用户上传三元组的文件目录不存在";
        public static final String THREE_TUPLE_NO_GRAPH_IN_DB_CODE = "1410";
        public static final String THREE_TUPLE_NO_GRAPH_IN_DB_MSG = "三元组导入的图谱在数据库中不存在";
        public static final String THREE_TUPLE_NO_GROUP_ID_CODE = "1411";
        public static final String THREE_TUPLE_NO_GROUP_ID_MSG = "任务的groupId不能为空";
        public static final String THREE_TUPLE_START_LINE_NULL_CODE = "1412";
        public static final String THREE_TUPLE_START_LINE_NULL_MSG = "startLine不能为空";
        public static final String THREE_TUPLE_NO_TASK_IN_DB_CODE = "1413";
        public static final String THREE_TUPLE_NO_TASK_IN_DB_MSG = "startLine不能为空";
        public static final String THREE_TUPLE_DELETE_DB_FAIL_CODE = "1414";
        public static final String THREE_TUPLE_DELETE_DB_FAIL_MSG = "数据库删除失败";
        public static final String THREE_TUPLE_ID_NULL_CODE = "1415";
        public static final String THREE_TUPLE_ID_NULL_MSG = "传入的id不能为空";
        public static final String THREE_TUPLE_NO_FILE_CODE = "1416";
        public static final String THREE_TUPLE_NO_FILE_MSG = "创建三元组导入任务需要先上传文件";


        //抽取式导入
        public static final String EXTRACT_BUILD_ERROR_CODE = "1501";
        public static final String EXTRACT_BUILD_ERROR_MSG = "抽取文档id不能为空！";

        public static final String EXTRACT_INFO_ERROR_CODE = "1502";
        public static final String EXTRACT_INFO_ERROR_MSG = "获取文档抽取详情异常！";

        public static final String EXTRACT_INFO_ERROR_CODE_3 = "1503";
        public static final String EXTRACT_INFO_ERROR_MSG_3 = "未选择图谱！";

        public static final String EXTRACT_INFO_ERROR_CODE_4 = "1504";
        public static final String EXTRACT_INFO_ERROR_MSG_4 = "构建任务列表不能为空！";


        public static final String EXTRACT_INFO_ERROR_CODE_5 = "1505";
        public static final String EXTRACT_INFO_ERROR_MSG_5 = "查询任务列表不能为空！";


        public static final String EXTRACT_INFO_ERROR_CODE_6 = "1506";
        public static final String EXTRACT_INFO_ERROR_MSG_6 = "同步文档类型异常！";

        public static final String EXTRACT_INFO_ERROR_CODE_7 = "1507";
        public static final String EXTRACT_INFO_ERROR_MSG_7 = "参数不能为空，请检查必输字段！";

        public static final String EXTRACT_INFO_ERROR_CODE_8 = "1508";
        public static final String EXTRACT_INFO_ERROR_MSG_8 = "未构建，无构建日志！";


        // 图谱问答配置
        public static final String RULE_INFO_ERROR_CODE_1 = "1601";
        public static final String RULE_INFO_ERROR_MSG_1 = "未查找到相关规则记录";
        public static final String RULE_INFO_ERROR_CODE_2 = "1602";
        public static final String RULE_INFO_ERROR_MSG_2 = "规则类型不能为全部类型";


        //非结构化数据
        public static final String UNSTRUCTED_DATA_MISS_PARAM_CODE = "1601";
        public static final String UNSTRUCTED_DATA_MISS_PARAM_MSG = "缺少请求值";

        public static final String UNSTRUCTED_DATA_MISS_IN_MYSQL_CODE = "1602";
        public static final String UNSTRUCTED_DATA_MISS_IN_MYSQL_MSG = "对应id数据库找不到文件";

        public static final String UNSTRUCTED_DATA_MISS_DIC_CODE = "1603";
        public static final String UNSTRUCTED_DATA_MISS_DIC_MSG = "对应id数据库找不到文件夹";

        public static final String UNSTRUCTED_DATA_SEARCH_CODE = "1604";
        public static final String UNSTRUCTED_DATA_SEARCH_MSG = "搜索异常";

        public static final String UNSTRUCTED_DATA_HANDLER_MYSQL_CODE = "1605";
        public static final String UNSTRUCTED_DATA_HANDLER_MYSQL_MSG = "无法使用mysql作为分片上传的媒介";

        public static final String UNSTRUCTED_DATA_UPLOAD_FIAL_CODE = "1606";
        public static final String UNSTRUCTED_DATA_UPLOAD_FIAL_MSG = "上传文件失败";

        public static final String UNSTRUCTED_DATA_DELETE_CODE = "1607";
        public static final String UNSTRUCTED_DATA_DELETE_MSG = "文件已经被删除";


        public static final String UNSTRUCTED_DATA_FILE_NOT_FOUND_CODE = "1608";
        public static final String UNSTRUCTED_DATA_FILE_NOT_FOUND_MSG = "找不到源文件";

        // 管理大厅
        public static final String MANAGER_CENTER_READ_DB_FALL_CODE = "1701";
        public static final String MANAGER_CENTER_READ_DB_FALL_MSG = "数据库查询失败";
        public static final String MANAGER_CENTER_NULL_WHICH_GRAPH_CODE = "1702";
        public static final String MANAGER_CENTER_NULL_WHICH_GRAPH_MSG = "whichGraph参数不能为空";
        public static final String MANAGER_CENTER_SEARCH_ES_CODE = "1703";
        public static final String MANAGER_CENTER_SEARCH_ES_MSG = "es查询失败";
        public static final String MANAGER_CENTER_SAVE_DB_FALL_CODE = "1704";
        public static final String MANAGER_CENTER_SAVE_DB_FALL_MSG = "数据库保存失败";
        public static final String MANAGER_CENTER_GRAPH_ANALYSIS_CODE = "1705";
        public static final String MANAGER_CENTER_GRAPH_ANALYSIS_MSG = "处理图谱性能参数失败";

        // kg-db
        public static final String KG_DB_SOURCE_DETAIL_NULL_CODE = "1801";
        public static final String KG_DB_SOURCE_DETAIL_NULL_MSG = "连接数据源的配置信息不能为空";
        public static final String KG_DB_SOURCE_TYPE_NULL_CODE = "1802";
        public static final String KG_DB_SOURCE_TYPE_NULL_MSG = "连接数据源的配置信息必须指定sourceType";
        public static final String KG_DB_DRIVER_NULL_CODE = "1803";
        public static final String KG_DB_DRIVER_NULL_MSG = "连接数据源的配置信息必须指定driver";
        public static final String KG_DB_URL_NULL_CODE = "1804";
        public static final String KG_DB_URL_NULL_MSG = "连接数据源的配置信息必须指定url";
        public static final String KG_DB_GET_CONNECTION_FAIL_CODE = "1805";
        public static final String KG_DB_GET_CONNECTION_FAIL_MSG = "数据源连接失败";

        // 图谱索引管理
        public static final String GRAPH_INDEX_READ_DB_FALL_CODE = "1901";
        public static final String GRAPH_INDEX_READ_DB_FALL_MSG = "数据库查询失败";
        public static final String GRAPH_INDEX_GET_FALL_CODE = "1902";
        public static final String GRAPH_INDEX_GET_FALL_MSG = "图谱索引获取失败";
        public static final String GRAPH_INDEX_NOT_EXIST_IN_JANUS_FALL_CODE = "1903";
        public static final String GRAPH_INDEX_NOT_EXIST_IN_JANUS_FALL_MSG = "图谱不在图数据库中";
        public static final String GRAPH_INDEX_HAS_INITIAL_FALL_CODE = "1904";
        public static final String GRAPH_INDEX_HAS_INITIAL_FALL_MSG = "图谱索引已经完成刷新，请在{0}分钟之后重试";

        // idps规则
        public static final String IDPS_POST_REQUEST_CODE = "2001";
        public static final String IDPS_POST_REQUEST_MSG = "post请求失败";
    }

    public static final String DEFAULT_DIR = "默认文件夹";


    //--------------------------------小黑所需 start --------------------------------
    //AlgorithmQueryImpl
    //start
    public static final String EDGE_STARTTIMESTAMP = "startTime";
    public static final String EDGE_ENDTIMESTAMP = "endTime";
    public static final Long DEFAULT_EDGE_STARTTIMESTAMP = 0L;
    public static final Long DEFAULT_EDGE_ENDTIMESTAMP = 0L;
    //end

    //JanusGVertexAboutQueryImpl
    //start
    public static final Long DEFAULT_VERTEXLISTNUM = 1000L;
    //end

    //JanusGraphBaseQuery
    //start
    public static final Long PAGE_SIZE_LIMIT_PSTART = 0L;
    public static final Long PAGE_SIZE_LIMIT_PEND = 200L;

    public static final Long DEFAULT_START_TIMESTAMP = 0L;
    public static final Long DEFAULT_END_TIMESTAMP = 0L;
    public static final Integer DEFAULT_OUT_LEVEL = 1;
    //end

    //JanusGVertexAboutQueryImpl
    //start
    //模糊查询相关点的个数
    public static final String FUZZY_QUERY_CONUT = "count";
    //模糊查询相关点的list
    public static final String FUZZY_VERTEX_LIST = "vertexList";
    //name
    public static final String PROPERTY_NAME = "name";

    public static final String PROPERTY_LABELPRO = "graphlabel";


    //end
    //--------------------------------小黑所需 end --------------------------------


    public class D2rConstant {
        //异常
        public static final String FAILED_COD_0651 = "0651";
        public static final String FAILED_COD_MSG51 = "实体映射，获取实体点参数错误";
        public static final String FAILED_COD_0652 = "0652";
        public static final String FAILED_COD_MSG52 = "实体映射，获取实体点数据集失败";
        public static final String FAILED_COD_0653 = "0653";
        public static final String FAILED_COD_MSG53 = "实体映射，获取实体点数据为空";
        public static final String FAILED_COD_0654 = "0654";
        public static final String FAILED_COD_MSG54 = "实体映射，获取实体点元数据报错";
        public static final String FAILED_COD_0655 = "0655";
        public static final String FAILED_COD_MSG55 = "实体映射，获取实体点真实数据报错";

        public static final String FAILED_COD_0661 = "0661";
        public static final String FAILED_COD_MSG61 = "关系映射，获取关系数据集失败";

        public static final String FAILED_COD_0662 = "0662";
        public static final String FAILED_COD_MSG62 = "属性映射，获取属性映射数据集失败";

        public static final String FAILED_COD_0663 = "0663";
        public static final String FAILED_COD_MSG63 = "索引建立失败";
        public static final String FAILED_COD_0664 = "0654";
        public static final String FAILED_COD_MSG64 = "索引建立数据reIndex失败";

        public static final String FAILED_COD_0665 = "0665";
        public static final String FAILED_COD_MSG65 = "数据库初始化，清空临时表错误";
        public static final String FAILED_COD_0666 = "0666";
        public static final String FAILED_COD_MSG66 = "未查到相关记录";
        public static final String FAILED_COD_0667 = "0667";
        public static final String FAILED_COD_MSG67 = "数据源设置有误";

        public static final String FAILED_COD_0668 = "0668";
        public static final String FAILED_COD_MSG68 = "实体映射数据点为空";

        public static final String FAILED_COD_0671 = "0671";
        public static final String FAILED_COD_MSG71 = "图设置有误";


        public static final String FAILED_COD_0672 = "0672";
        public static final String FAILED_COD_MSG72 = "图已经存在";

        public static final String FAILED_COD_0673 = "0673";
        public static final String FAILED_COD_MSG73 = "执行失败";

        public static final String FAILED_COD_0680 = "0680";
        public static final String FAILED_COD_MSG80 = "保存到数据库失败";

        public static final String FAILED_COD_0681 = "0681";
        public static final String FAILED_COD_MSG81 = "删除数据库数据失败";


        public static final String FAILED_COD_0682 = "0682";
        public static final String FAILED_COD_MSG82 = "D2r执行参数解析失败，未执行";

        public static final String FAILED_COD_0683 = "0683";
        public static final String FAILED_COD_MSG83 = "D2r新建任务错误";

        public static final String FAILED_COD_0684 = "0684";
        public static final String FAILED_COD_MSG84 = "D2r获取待配置任务失败";

        public static final String FAILED_COD_0685 = "0685";
        public static final String FAILED_COD_MSG85 = "请求D2r执行模块报错";

        public static final String FAILED_COD_0699 = "0699";
        public static final String FAILED_COD_MSG99 = "其他错误";

        public static final String FAILED_COD_0686 = "0686";
        public static final String FAILED_COD_MSG86 = "请求下一步时，任务id为空";

        public static final String FAILED_COD_0687 = "0687";
        public static final String FAILED_COD_MSG87 = "请求下一步时，数据源元数据id为空";

        public static final String FAILED_COD_0688 = "0688";
        public static final String FAILED_COD_MSG88 = "请求下一步时，数据集元数据id为空";

        public static final String FAILED_COD_0689 = "0689";
        public static final String FAILED_COD_MSG89 = "请求下一步时，数据库出错，请先配置上一步";

        public static final String FAILED_COD_0690 = "0690";
        public static final String FAILED_COD_MSG90 = "流程图数据信息，请求出错";

        public static final String FAILED_COD_0691 = "0691";
        public static final String FAILED_COD_MSG91 = "D2r任务信息不全";

        public static final String FAILED_COD_0692 = "0692";
        public static final String FAILED_COD_MSG92 = "算法任务信息不全";

        public static final String FAILED_COD_0693 = "0693";
        public static final String FAILED_COD_MSG93 = "请求算法任务执行模块报错";

        public static final String FAILED_COD_0694 = "0694";
        public static final String FAILED_COD_MSG94 = "算法任务执行参数解析失败，未执行";


        //导入数据start
        public static final String CODE = "code";
        public static final String NAME = "name";
        public static final String SOURCECODE = "sourceCode";
        public static final String TARGETCODE = "targetCode";
        public static final String ABS = "abs";
        public static final String IMG_PATH = "imgPath";
        public static final String hashMapDir = "./conf/hashMap";
        public static final String hashMapName = "/Hash";
        public static final int threadNum = 4;

        //导入数据end

        //索引start
        public static final String mixIndexSearchName = "search";
        public static final String compIndexName = "by" + CODE;
        public static final String mixedIndexName = "mixed" + CODE;
        //索引end

    }
}