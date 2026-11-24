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
    * <p>第三方应用平台的应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>合同模板ID</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>描述模板可见性更改的结果。</p><ul><li>all-success: 全部成功</li><li>part-success: 部分成功,失败的会在FailMessageList中展示</li><li>fail:全部失败, 失败的会在FailMessageList中展示</li></ul>
    */
    @SerializedName("OperateResult")
    @Expose
    private String OperateResult;

    /**
    * <p>模板可见范围:<br><strong>all</strong>: 所有本第三方应用合作企业可见<br><strong>part</strong>: 指定的本第三方应用合作企业</p>
    */
    @SerializedName("AuthTag")
    @Expose
    private String AuthTag;

    /**
    * <p>第三方平台子客企业标识列表，仅在select 模式下返回</p>
    */
    @SerializedName("ProxyOrganizationOpenIds")
    @Expose
    private String [] ProxyOrganizationOpenIds;

    /**
    * <p>操作失败信息数组</p>
    */
    @SerializedName("FailMessageList")
    @Expose
    private AuthFailMessage [] FailMessageList;

    /**
    * <p>授权的平台子企业数量，OperateType 为select 时返回。</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>第三方应用平台的应用ID</p> 
     * @return AppId <p>第三方应用平台的应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>第三方应用平台的应用ID</p>
     * @param AppId <p>第三方应用平台的应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>合同模板ID</p> 
     * @return TemplateId <p>合同模板ID</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>合同模板ID</p>
     * @param TemplateId <p>合同模板ID</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>描述模板可见性更改的结果。</p><ul><li>all-success: 全部成功</li><li>part-success: 部分成功,失败的会在FailMessageList中展示</li><li>fail:全部失败, 失败的会在FailMessageList中展示</li></ul> 
     * @return OperateResult <p>描述模板可见性更改的结果。</p><ul><li>all-success: 全部成功</li><li>part-success: 部分成功,失败的会在FailMessageList中展示</li><li>fail:全部失败, 失败的会在FailMessageList中展示</li></ul>
     */
    public String getOperateResult() {
        return this.OperateResult;
    }

    /**
     * Set <p>描述模板可见性更改的结果。</p><ul><li>all-success: 全部成功</li><li>part-success: 部分成功,失败的会在FailMessageList中展示</li><li>fail:全部失败, 失败的会在FailMessageList中展示</li></ul>
     * @param OperateResult <p>描述模板可见性更改的结果。</p><ul><li>all-success: 全部成功</li><li>part-success: 部分成功,失败的会在FailMessageList中展示</li><li>fail:全部失败, 失败的会在FailMessageList中展示</li></ul>
     */
    public void setOperateResult(String OperateResult) {
        this.OperateResult = OperateResult;
    }

    /**
     * Get <p>模板可见范围:<br><strong>all</strong>: 所有本第三方应用合作企业可见<br><strong>part</strong>: 指定的本第三方应用合作企业</p> 
     * @return AuthTag <p>模板可见范围:<br><strong>all</strong>: 所有本第三方应用合作企业可见<br><strong>part</strong>: 指定的本第三方应用合作企业</p>
     */
    public String getAuthTag() {
        return this.AuthTag;
    }

    /**
     * Set <p>模板可见范围:<br><strong>all</strong>: 所有本第三方应用合作企业可见<br><strong>part</strong>: 指定的本第三方应用合作企业</p>
     * @param AuthTag <p>模板可见范围:<br><strong>all</strong>: 所有本第三方应用合作企业可见<br><strong>part</strong>: 指定的本第三方应用合作企业</p>
     */
    public void setAuthTag(String AuthTag) {
        this.AuthTag = AuthTag;
    }

    /**
     * Get <p>第三方平台子客企业标识列表，仅在select 模式下返回</p> 
     * @return ProxyOrganizationOpenIds <p>第三方平台子客企业标识列表，仅在select 模式下返回</p>
     */
    public String [] getProxyOrganizationOpenIds() {
        return this.ProxyOrganizationOpenIds;
    }

    /**
     * Set <p>第三方平台子客企业标识列表，仅在select 模式下返回</p>
     * @param ProxyOrganizationOpenIds <p>第三方平台子客企业标识列表，仅在select 模式下返回</p>
     */
    public void setProxyOrganizationOpenIds(String [] ProxyOrganizationOpenIds) {
        this.ProxyOrganizationOpenIds = ProxyOrganizationOpenIds;
    }

    /**
     * Get <p>操作失败信息数组</p> 
     * @return FailMessageList <p>操作失败信息数组</p>
     */
    public AuthFailMessage [] getFailMessageList() {
        return this.FailMessageList;
    }

    /**
     * Set <p>操作失败信息数组</p>
     * @param FailMessageList <p>操作失败信息数组</p>
     */
    public void setFailMessageList(AuthFailMessage [] FailMessageList) {
        this.FailMessageList = FailMessageList;
    }

    /**
     * Get <p>授权的平台子企业数量，OperateType 为select 时返回。</p> 
     * @return Total <p>授权的平台子企业数量，OperateType 为select 时返回。</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>授权的平台子企业数量，OperateType 为select 时返回。</p>
     * @param Total <p>授权的平台子企业数量，OperateType 为select 时返回。</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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
        if (source.Total != null) {
            this.Total = new Long(source.Total);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

