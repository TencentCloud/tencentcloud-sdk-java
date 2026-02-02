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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CnameStatus extends AbstractModel {

    /**
    * 接入域名。
    */
    @SerializedName("RecordName")
    @Expose
    private String RecordName;

    /**
    * EdgeOne 分配给接入域名的 CNAME。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * CNAME 配置状态校验结果，取值有：
<li>active：表示接入域名已正确配置到 EdgeOne 为其分配的指定 CNAME；</li>
<li>moved：表示接入域名未配置到 EdgeOne 为其分配的指定 CNAME；</li>
<li>invalid：表示接入域名配置的 CNAME 为 EdgeOne 为其他域名分配的 CNAME，会导致服务异常，请修改为 EdgeOne 为该接入域名提供的指定 CNAME，您可通过本结构体的 Cname 字段获取 EdgeOne 为该接入域名提供的 CNAME。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 接入域名。 
     * @return RecordName 接入域名。
     */
    public String getRecordName() {
        return this.RecordName;
    }

    /**
     * Set 接入域名。
     * @param RecordName 接入域名。
     */
    public void setRecordName(String RecordName) {
        this.RecordName = RecordName;
    }

    /**
     * Get EdgeOne 分配给接入域名的 CNAME。 
     * @return Cname EdgeOne 分配给接入域名的 CNAME。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set EdgeOne 分配给接入域名的 CNAME。
     * @param Cname EdgeOne 分配给接入域名的 CNAME。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get CNAME 配置状态校验结果，取值有：
<li>active：表示接入域名已正确配置到 EdgeOne 为其分配的指定 CNAME；</li>
<li>moved：表示接入域名未配置到 EdgeOne 为其分配的指定 CNAME；</li>
<li>invalid：表示接入域名配置的 CNAME 为 EdgeOne 为其他域名分配的 CNAME，会导致服务异常，请修改为 EdgeOne 为该接入域名提供的指定 CNAME，您可通过本结构体的 Cname 字段获取 EdgeOne 为该接入域名提供的 CNAME。</li> 
     * @return Status CNAME 配置状态校验结果，取值有：
<li>active：表示接入域名已正确配置到 EdgeOne 为其分配的指定 CNAME；</li>
<li>moved：表示接入域名未配置到 EdgeOne 为其分配的指定 CNAME；</li>
<li>invalid：表示接入域名配置的 CNAME 为 EdgeOne 为其他域名分配的 CNAME，会导致服务异常，请修改为 EdgeOne 为该接入域名提供的指定 CNAME，您可通过本结构体的 Cname 字段获取 EdgeOne 为该接入域名提供的 CNAME。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set CNAME 配置状态校验结果，取值有：
<li>active：表示接入域名已正确配置到 EdgeOne 为其分配的指定 CNAME；</li>
<li>moved：表示接入域名未配置到 EdgeOne 为其分配的指定 CNAME；</li>
<li>invalid：表示接入域名配置的 CNAME 为 EdgeOne 为其他域名分配的 CNAME，会导致服务异常，请修改为 EdgeOne 为该接入域名提供的指定 CNAME，您可通过本结构体的 Cname 字段获取 EdgeOne 为该接入域名提供的 CNAME。</li>
     * @param Status CNAME 配置状态校验结果，取值有：
<li>active：表示接入域名已正确配置到 EdgeOne 为其分配的指定 CNAME；</li>
<li>moved：表示接入域名未配置到 EdgeOne 为其分配的指定 CNAME；</li>
<li>invalid：表示接入域名配置的 CNAME 为 EdgeOne 为其他域名分配的 CNAME，会导致服务异常，请修改为 EdgeOne 为该接入域名提供的指定 CNAME，您可通过本结构体的 Cname 字段获取 EdgeOne 为该接入域名提供的 CNAME。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CnameStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CnameStatus(CnameStatus source) {
        if (source.RecordName != null) {
            this.RecordName = new String(source.RecordName);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordName", this.RecordName);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

