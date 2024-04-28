/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppResponse extends AbstractModel {

    /**
    * 应用 ID
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 应用类型说明
    */
    @SerializedName("AppTypeDesc")
    @Expose
    private String AppTypeDesc;

    /**
    * 应用类型说明
    */
    @SerializedName("BaseConfig")
    @Expose
    private BaseConfig BaseConfig;

    /**
    * 应用配置
    */
    @SerializedName("AppConfig")
    @Expose
    private AppConfig AppConfig;

    /**
    * 头像是否在申诉中
    */
    @SerializedName("AvatarInAppeal")
    @Expose
    private Boolean AvatarInAppeal;

    /**
    * 角色描述是否在申诉中
    */
    @SerializedName("RoleInAppeal")
    @Expose
    private Boolean RoleInAppeal;

    /**
    * 名称是否在申诉中
    */
    @SerializedName("NameInAppeal")
    @Expose
    private Boolean NameInAppeal;

    /**
    * 欢迎语是否在申诉中
    */
    @SerializedName("GreetingInAppeal")
    @Expose
    private Boolean GreetingInAppeal;

    /**
    * 未知问题回复语是否在申诉中
    */
    @SerializedName("BareAnswerInAppeal")
    @Expose
    private Boolean BareAnswerInAppeal;

    /**
    * 应用appKey
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * 应用状态，1：未上线，2：运行中，3：停用
    */
    @SerializedName("AppStatus")
    @Expose
    private Long AppStatus;

    /**
    * 状态说明
    */
    @SerializedName("AppStatusDesc")
    @Expose
    private String AppStatusDesc;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 应用 ID 
     * @return AppBizId 应用 ID
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用 ID
     * @param AppBizId 应用 ID
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取 
     * @return AppType 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
     * @param AppType 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 应用类型说明 
     * @return AppTypeDesc 应用类型说明
     */
    public String getAppTypeDesc() {
        return this.AppTypeDesc;
    }

    /**
     * Set 应用类型说明
     * @param AppTypeDesc 应用类型说明
     */
    public void setAppTypeDesc(String AppTypeDesc) {
        this.AppTypeDesc = AppTypeDesc;
    }

    /**
     * Get 应用类型说明 
     * @return BaseConfig 应用类型说明
     */
    public BaseConfig getBaseConfig() {
        return this.BaseConfig;
    }

    /**
     * Set 应用类型说明
     * @param BaseConfig 应用类型说明
     */
    public void setBaseConfig(BaseConfig BaseConfig) {
        this.BaseConfig = BaseConfig;
    }

    /**
     * Get 应用配置 
     * @return AppConfig 应用配置
     */
    public AppConfig getAppConfig() {
        return this.AppConfig;
    }

    /**
     * Set 应用配置
     * @param AppConfig 应用配置
     */
    public void setAppConfig(AppConfig AppConfig) {
        this.AppConfig = AppConfig;
    }

    /**
     * Get 头像是否在申诉中 
     * @return AvatarInAppeal 头像是否在申诉中
     */
    public Boolean getAvatarInAppeal() {
        return this.AvatarInAppeal;
    }

    /**
     * Set 头像是否在申诉中
     * @param AvatarInAppeal 头像是否在申诉中
     */
    public void setAvatarInAppeal(Boolean AvatarInAppeal) {
        this.AvatarInAppeal = AvatarInAppeal;
    }

    /**
     * Get 角色描述是否在申诉中 
     * @return RoleInAppeal 角色描述是否在申诉中
     */
    public Boolean getRoleInAppeal() {
        return this.RoleInAppeal;
    }

    /**
     * Set 角色描述是否在申诉中
     * @param RoleInAppeal 角色描述是否在申诉中
     */
    public void setRoleInAppeal(Boolean RoleInAppeal) {
        this.RoleInAppeal = RoleInAppeal;
    }

    /**
     * Get 名称是否在申诉中 
     * @return NameInAppeal 名称是否在申诉中
     */
    public Boolean getNameInAppeal() {
        return this.NameInAppeal;
    }

    /**
     * Set 名称是否在申诉中
     * @param NameInAppeal 名称是否在申诉中
     */
    public void setNameInAppeal(Boolean NameInAppeal) {
        this.NameInAppeal = NameInAppeal;
    }

    /**
     * Get 欢迎语是否在申诉中 
     * @return GreetingInAppeal 欢迎语是否在申诉中
     */
    public Boolean getGreetingInAppeal() {
        return this.GreetingInAppeal;
    }

    /**
     * Set 欢迎语是否在申诉中
     * @param GreetingInAppeal 欢迎语是否在申诉中
     */
    public void setGreetingInAppeal(Boolean GreetingInAppeal) {
        this.GreetingInAppeal = GreetingInAppeal;
    }

    /**
     * Get 未知问题回复语是否在申诉中 
     * @return BareAnswerInAppeal 未知问题回复语是否在申诉中
     */
    public Boolean getBareAnswerInAppeal() {
        return this.BareAnswerInAppeal;
    }

    /**
     * Set 未知问题回复语是否在申诉中
     * @param BareAnswerInAppeal 未知问题回复语是否在申诉中
     */
    public void setBareAnswerInAppeal(Boolean BareAnswerInAppeal) {
        this.BareAnswerInAppeal = BareAnswerInAppeal;
    }

    /**
     * Get 应用appKey 
     * @return AppKey 应用appKey
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set 应用appKey
     * @param AppKey 应用appKey
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get 应用状态，1：未上线，2：运行中，3：停用 
     * @return AppStatus 应用状态，1：未上线，2：运行中，3：停用
     */
    public Long getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set 应用状态，1：未上线，2：运行中，3：停用
     * @param AppStatus 应用状态，1：未上线，2：运行中，3：停用
     */
    public void setAppStatus(Long AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get 状态说明 
     * @return AppStatusDesc 状态说明
     */
    public String getAppStatusDesc() {
        return this.AppStatusDesc;
    }

    /**
     * Set 状态说明
     * @param AppStatusDesc 状态说明
     */
    public void setAppStatusDesc(String AppStatusDesc) {
        this.AppStatusDesc = AppStatusDesc;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAppResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppResponse(DescribeAppResponse source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.AppTypeDesc != null) {
            this.AppTypeDesc = new String(source.AppTypeDesc);
        }
        if (source.BaseConfig != null) {
            this.BaseConfig = new BaseConfig(source.BaseConfig);
        }
        if (source.AppConfig != null) {
            this.AppConfig = new AppConfig(source.AppConfig);
        }
        if (source.AvatarInAppeal != null) {
            this.AvatarInAppeal = new Boolean(source.AvatarInAppeal);
        }
        if (source.RoleInAppeal != null) {
            this.RoleInAppeal = new Boolean(source.RoleInAppeal);
        }
        if (source.NameInAppeal != null) {
            this.NameInAppeal = new Boolean(source.NameInAppeal);
        }
        if (source.GreetingInAppeal != null) {
            this.GreetingInAppeal = new Boolean(source.GreetingInAppeal);
        }
        if (source.BareAnswerInAppeal != null) {
            this.BareAnswerInAppeal = new Boolean(source.BareAnswerInAppeal);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Long(source.AppStatus);
        }
        if (source.AppStatusDesc != null) {
            this.AppStatusDesc = new String(source.AppStatusDesc);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "AppTypeDesc", this.AppTypeDesc);
        this.setParamObj(map, prefix + "BaseConfig.", this.BaseConfig);
        this.setParamObj(map, prefix + "AppConfig.", this.AppConfig);
        this.setParamSimple(map, prefix + "AvatarInAppeal", this.AvatarInAppeal);
        this.setParamSimple(map, prefix + "RoleInAppeal", this.RoleInAppeal);
        this.setParamSimple(map, prefix + "NameInAppeal", this.NameInAppeal);
        this.setParamSimple(map, prefix + "GreetingInAppeal", this.GreetingInAppeal);
        this.setParamSimple(map, prefix + "BareAnswerInAppeal", this.BareAnswerInAppeal);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "AppStatusDesc", this.AppStatusDesc);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

