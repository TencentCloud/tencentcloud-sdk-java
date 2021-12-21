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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateChannelTemplateResponse extends AbstractModel{

    /**
    * 腾讯电子签颁发给渠道的应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 渠道方模板库模板唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 全部成功-"all-success",部分成功-"part-success", 全部失败-"fail"失败的会在FailMessageList中展示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateResult")
    @Expose
    private String OperateResult;

    /**
    * 模板可见性, 全部可见-"all", 部分可见-"part"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthTag")
    @Expose
    private String AuthTag;

    /**
    * 合作企业方第三方机构唯一标识数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyOrganizationOpenIds")
    @Expose
    private String [] ProxyOrganizationOpenIds;

    /**
    * 操作失败信息数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailMessageList")
    @Expose
    private AuthFailMessage [] FailMessageList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 腾讯电子签颁发给渠道的应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 腾讯电子签颁发给渠道的应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 腾讯电子签颁发给渠道的应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 腾讯电子签颁发给渠道的应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 渠道方模板库模板唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 渠道方模板库模板唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 渠道方模板库模板唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 渠道方模板库模板唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 全部成功-"all-success",部分成功-"part-success", 全部失败-"fail"失败的会在FailMessageList中展示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateResult 全部成功-"all-success",部分成功-"part-success", 全部失败-"fail"失败的会在FailMessageList中展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateResult() {
        return this.OperateResult;
    }

    /**
     * Set 全部成功-"all-success",部分成功-"part-success", 全部失败-"fail"失败的会在FailMessageList中展示
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateResult 全部成功-"all-success",部分成功-"part-success", 全部失败-"fail"失败的会在FailMessageList中展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateResult(String OperateResult) {
        this.OperateResult = OperateResult;
    }

    /**
     * Get 模板可见性, 全部可见-"all", 部分可见-"part"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthTag 模板可见性, 全部可见-"all", 部分可见-"part"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthTag() {
        return this.AuthTag;
    }

    /**
     * Set 模板可见性, 全部可见-"all", 部分可见-"part"
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthTag 模板可见性, 全部可见-"all", 部分可见-"part"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthTag(String AuthTag) {
        this.AuthTag = AuthTag;
    }

    /**
     * Get 合作企业方第三方机构唯一标识数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyOrganizationOpenIds 合作企业方第三方机构唯一标识数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProxyOrganizationOpenIds() {
        return this.ProxyOrganizationOpenIds;
    }

    /**
     * Set 合作企业方第三方机构唯一标识数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyOrganizationOpenIds 合作企业方第三方机构唯一标识数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyOrganizationOpenIds(String [] ProxyOrganizationOpenIds) {
        this.ProxyOrganizationOpenIds = ProxyOrganizationOpenIds;
    }

    /**
     * Get 操作失败信息数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailMessageList 操作失败信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthFailMessage [] getFailMessageList() {
        return this.FailMessageList;
    }

    /**
     * Set 操作失败信息数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailMessageList 操作失败信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailMessageList(AuthFailMessage [] FailMessageList) {
        this.FailMessageList = FailMessageList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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

