/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateChannelTemplateResponse extends AbstractModel {

    /**
    * 第三方应用平台的应用ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 合同模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 描述模板可见性更改的结果。
<ul>
<li>all-success: 全部成功</li>
<li>part-success: 部分成功,失败的会在FailMessageList中展示</li>
<li>fail:全部失败, 失败的会在FailMessageList中展示</li>
</ul>
    */
    @SerializedName("OperateResult")
    @Expose
    private String OperateResult;

    /**
    * 模板可见范围:
**all**: 所有本第三方应用合作企业可见
**part**: 指定的本第三方应用合作企业
    */
    @SerializedName("AuthTag")
    @Expose
    private String AuthTag;

    /**
    * 第三方平台子客企业标识列表
    */
    @SerializedName("ProxyOrganizationOpenIds")
    @Expose
    private String [] ProxyOrganizationOpenIds;

    /**
    * 操作失败信息数组
    */
    @SerializedName("FailMessageList")
    @Expose
    private AuthFailMessage [] FailMessageList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 第三方应用平台的应用ID 
     * @return AppId 第三方应用平台的应用ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 第三方应用平台的应用ID
     * @param AppId 第三方应用平台的应用ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 合同模板ID 
     * @return TemplateId 合同模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 合同模板ID
     * @param TemplateId 合同模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 描述模板可见性更改的结果。
<ul>
<li>all-success: 全部成功</li>
<li>part-success: 部分成功,失败的会在FailMessageList中展示</li>
<li>fail:全部失败, 失败的会在FailMessageList中展示</li>
</ul> 
     * @return OperateResult 描述模板可见性更改的结果。
<ul>
<li>all-success: 全部成功</li>
<li>part-success: 部分成功,失败的会在FailMessageList中展示</li>
<li>fail:全部失败, 失败的会在FailMessageList中展示</li>
</ul>
     */
    public String getOperateResult() {
        return this.OperateResult;
    }

    /**
     * Set 描述模板可见性更改的结果。
<ul>
<li>all-success: 全部成功</li>
<li>part-success: 部分成功,失败的会在FailMessageList中展示</li>
<li>fail:全部失败, 失败的会在FailMessageList中展示</li>
</ul>
     * @param OperateResult 描述模板可见性更改的结果。
<ul>
<li>all-success: 全部成功</li>
<li>part-success: 部分成功,失败的会在FailMessageList中展示</li>
<li>fail:全部失败, 失败的会在FailMessageList中展示</li>
</ul>
     */
    public void setOperateResult(String OperateResult) {
        this.OperateResult = OperateResult;
    }

    /**
     * Get 模板可见范围:
**all**: 所有本第三方应用合作企业可见
**part**: 指定的本第三方应用合作企业 
     * @return AuthTag 模板可见范围:
**all**: 所有本第三方应用合作企业可见
**part**: 指定的本第三方应用合作企业
     */
    public String getAuthTag() {
        return this.AuthTag;
    }

    /**
     * Set 模板可见范围:
**all**: 所有本第三方应用合作企业可见
**part**: 指定的本第三方应用合作企业
     * @param AuthTag 模板可见范围:
**all**: 所有本第三方应用合作企业可见
**part**: 指定的本第三方应用合作企业
     */
    public void setAuthTag(String AuthTag) {
        this.AuthTag = AuthTag;
    }

    /**
     * Get 第三方平台子客企业标识列表 
     * @return ProxyOrganizationOpenIds 第三方平台子客企业标识列表
     */
    public String [] getProxyOrganizationOpenIds() {
        return this.ProxyOrganizationOpenIds;
    }

    /**
     * Set 第三方平台子客企业标识列表
     * @param ProxyOrganizationOpenIds 第三方平台子客企业标识列表
     */
    public void setProxyOrganizationOpenIds(String [] ProxyOrganizationOpenIds) {
        this.ProxyOrganizationOpenIds = ProxyOrganizationOpenIds;
    }

    /**
     * Get 操作失败信息数组 
     * @return FailMessageList 操作失败信息数组
     */
    public AuthFailMessage [] getFailMessageList() {
        return this.FailMessageList;
    }

    /**
     * Set 操作失败信息数组
     * @param FailMessageList 操作失败信息数组
     */
    public void setFailMessageList(AuthFailMessage [] FailMessageList) {
        this.FailMessageList = FailMessageList;
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

    public OperateChannelTemplateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateChannelTemplateResponse(OperateChannelTemplateResponse source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.OperateResult != null) {
            this.OperateResult = new String(source.OperateResult);
        }
        if (source.AuthTag != null) {
            this.AuthTag = new String(source.AuthTag);
        }
        if (source.ProxyOrganizationOpenIds != null) {
            this.ProxyOrganizationOpenIds = new String[source.ProxyOrganizationOpenIds.length];
            for (int i = 0; i < source.ProxyOrganizationOpenIds.length; i++) {
                this.ProxyOrganizationOpenIds[i] = new String(source.ProxyOrganizationOpenIds[i]);
            }
        }
        if (source.FailMessageList != null) {
            this.FailMessageList = new AuthFailMessage[source.FailMessageList.length];
            for (int i = 0; i < source.FailMessageList.length; i++) {
                this.FailMessageList[i] = new AuthFailMessage(source.FailMessageList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "OperateResult", this.OperateResult);
        this.setParamSimple(map, prefix + "AuthTag", this.AuthTag);
        this.setParamArraySimple(map, prefix + "ProxyOrganizationOpenIds.", this.ProxyOrganizationOpenIds);
        this.setParamArrayObj(map, prefix + "FailMessageList.", this.FailMessageList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

