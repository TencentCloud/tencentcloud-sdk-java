package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateSecurityGroupRequest  extends AbstractModel{


    /**
    * 项目id，默认0。可在qcloud控制台项目管理页面查询到。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 安全组名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 安全组备注，最多100个字符。
    */
    @SerializedName("GroupDescription")
    @Expose
    private String GroupDescription;

    /**
     * 获取项目id，默认0。可在qcloud控制台项目管理页面查询到。
     * @return ProjectId 项目id，默认0。可在qcloud控制台项目管理页面查询到。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目id，默认0。可在qcloud控制台项目管理页面查询到。
     * @param ProjectId 项目id，默认0。可在qcloud控制台项目管理页面查询到。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取安全组名称，可任意命名，但不得超过60个字符。
     * @return GroupName 安全组名称，可任意命名，但不得超过60个字符。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * 设置安全组名称，可任意命名，但不得超过60个字符。
     * @param GroupName 安全组名称，可任意命名，但不得超过60个字符。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * 获取安全组备注，最多100个字符。
     * @return GroupDescription 安全组备注，最多100个字符。
     */
    public String getGroupDescription() {
        return this.GroupDescription;
    }

    /**
     * 设置安全组备注，最多100个字符。
     * @param GroupDescription 安全组备注，最多100个字符。
     */
    public void setGroupDescription(String GroupDescription) {
        this.GroupDescription = GroupDescription;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupDescription", this.GroupDescription);

    }
}

