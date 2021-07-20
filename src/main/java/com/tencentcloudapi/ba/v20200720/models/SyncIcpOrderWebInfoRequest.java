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
package com.tencentcloudapi.ba.v20200720.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncIcpOrderWebInfoRequest extends AbstractModel{

    /**
    * 备案ICP订单号
    */
    @SerializedName("IcpOrderId")
    @Expose
    private String IcpOrderId;

    /**
    * 订单里的webId
    */
    @SerializedName("SourceWebId")
    @Expose
    private String SourceWebId;

    /**
    * 订单里的webId 数组(如果传入的webIds含有 订单中不包含的webId，会自动跳过)
    */
    @SerializedName("TargetWebIds")
    @Expose
    private String [] TargetWebIds;

    /**
    * 网站信息字段名 数组
    */
    @SerializedName("SyncFields")
    @Expose
    private String [] SyncFields;

    /**
    * 是否先判断同步的网站负责人是否一致 (这里会判断 sitePersonName, sitePersonCerType,sitePersonCerNum三个字段完全一致)  默认:true. 非必要 不建议关闭修改该参数默认值
    */
    @SerializedName("CheckSamePerson")
    @Expose
    private Boolean CheckSamePerson;

    /**
     * Get 备案ICP订单号 
     * @return IcpOrderId 备案ICP订单号
     */
    public String getIcpOrderId() {
        return this.IcpOrderId;
    }

    /**
     * Set 备案ICP订单号
     * @param IcpOrderId 备案ICP订单号
     */
    public void setIcpOrderId(String IcpOrderId) {
        this.IcpOrderId = IcpOrderId;
    }

    /**
     * Get 订单里的webId 
     * @return SourceWebId 订单里的webId
     */
    public String getSourceWebId() {
        return this.SourceWebId;
    }

    /**
     * Set 订单里的webId
     * @param SourceWebId 订单里的webId
     */
    public void setSourceWebId(String SourceWebId) {
        this.SourceWebId = SourceWebId;
    }

    /**
     * Get 订单里的webId 数组(如果传入的webIds含有 订单中不包含的webId，会自动跳过) 
     * @return TargetWebIds 订单里的webId 数组(如果传入的webIds含有 订单中不包含的webId，会自动跳过)
     */
    public String [] getTargetWebIds() {
        return this.TargetWebIds;
    }

    /**
     * Set 订单里的webId 数组(如果传入的webIds含有 订单中不包含的webId，会自动跳过)
     * @param TargetWebIds 订单里的webId 数组(如果传入的webIds含有 订单中不包含的webId，会自动跳过)
     */
    public void setTargetWebIds(String [] TargetWebIds) {
        this.TargetWebIds = TargetWebIds;
    }

    /**
     * Get 网站信息字段名 数组 
     * @return SyncFields 网站信息字段名 数组
     */
    public String [] getSyncFields() {
        return this.SyncFields;
    }

    /**
     * Set 网站信息字段名 数组
     * @param SyncFields 网站信息字段名 数组
     */
    public void setSyncFields(String [] SyncFields) {
        this.SyncFields = SyncFields;
    }

    /**
     * Get 是否先判断同步的网站负责人是否一致 (这里会判断 sitePersonName, sitePersonCerType,sitePersonCerNum三个字段完全一致)  默认:true. 非必要 不建议关闭修改该参数默认值 
     * @return CheckSamePerson 是否先判断同步的网站负责人是否一致 (这里会判断 sitePersonName, sitePersonCerType,sitePersonCerNum三个字段完全一致)  默认:true. 非必要 不建议关闭修改该参数默认值
     */
    public Boolean getCheckSamePerson() {
        return this.CheckSamePerson;
    }

    /**
     * Set 是否先判断同步的网站负责人是否一致 (这里会判断 sitePersonName, sitePersonCerType,sitePersonCerNum三个字段完全一致)  默认:true. 非必要 不建议关闭修改该参数默认值
     * @param CheckSamePerson 是否先判断同步的网站负责人是否一致 (这里会判断 sitePersonName, sitePersonCerType,sitePersonCerNum三个字段完全一致)  默认:true. 非必要 不建议关闭修改该参数默认值
     */
    public void setCheckSamePerson(Boolean CheckSamePerson) {
        this.CheckSamePerson = CheckSamePerson;
    }

    public SyncIcpOrderWebInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncIcpOrderWebInfoRequest(SyncIcpOrderWebInfoRequest source) {
        if (source.IcpOrderId != null) {
            this.IcpOrderId = new String(source.IcpOrderId);
        }
        if (source.SourceWebId != null) {
            this.SourceWebId = new String(source.SourceWebId);
        }
        if (source.TargetWebIds != null) {
            this.TargetWebIds = new String[source.TargetWebIds.length];
            for (int i = 0; i < source.TargetWebIds.length; i++) {
                this.TargetWebIds[i] = new String(source.TargetWebIds[i]);
            }
        }
        if (source.SyncFields != null) {
            this.SyncFields = new String[source.SyncFields.length];
            for (int i = 0; i < source.SyncFields.length; i++) {
                this.SyncFields[i] = new String(source.SyncFields[i]);
            }
        }
        if (source.CheckSamePerson != null) {
            this.CheckSamePerson = new Boolean(source.CheckSamePerson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IcpOrderId", this.IcpOrderId);
        this.setParamSimple(map, prefix + "SourceWebId", this.SourceWebId);
        this.setParamArraySimple(map, prefix + "TargetWebIds.", this.TargetWebIds);
        this.setParamArraySimple(map, prefix + "SyncFields.", this.SyncFields);
        this.setParamSimple(map, prefix + "CheckSamePerson", this.CheckSamePerson);

    }
}

