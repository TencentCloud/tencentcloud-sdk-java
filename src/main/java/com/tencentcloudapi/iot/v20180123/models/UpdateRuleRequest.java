package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class UpdateRuleRequest  extends AbstractModel{


    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;
    

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;
    

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;
    

    /**
    * 查询
    */
    @SerializedName("Query")
    @Expose
    private RuleQuery Query;
    

    /**
    * 转发
    */
    @SerializedName("Actions")
    @Expose
    private Object [] Actions;
    

    /**
     * 获取规则Id
     * @return RuleId 规则Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取名称
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取描述
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取查询
     * @return Query 查询
     */
    public RuleQuery getQuery() {
        return this.Query;
    }

    /**
     * 设置查询
     * @param Query 查询
     */
    public void setQuery(RuleQuery Query) {
        this.Query = Query;
    }

    /**
     * 获取转发
     * @return Actions 转发
     */
    public Object [] getActions() {
        return this.Actions;
    }

    /**
     * 设置转发
     * @param Actions 转发
     */
    public void setActions(Object [] Actions) {
        this.Actions = Actions;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Query.", this.Query);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);

    }
}

