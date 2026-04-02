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

public class ModifySharedCNAMERequest extends AbstractModel {

    /**
    * 共享 CNAME 所属站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 共享 CNAME。
    */
    @SerializedName("SharedCNAME")
    @Expose
    private String SharedCNAME;

    /**
    * 请输入调整后的描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设置IP SSL 类型的共享CNAME 的 IP SSL 信息。
    */
    @SerializedName("IPSSLSetting")
    @Expose
    private IPSSLSetting IPSSLSetting;

    /**
     * Get 共享 CNAME 所属站点 ID。 
     * @return ZoneId 共享 CNAME 所属站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 共享 CNAME 所属站点 ID。
     * @param ZoneId 共享 CNAME 所属站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 共享 CNAME。 
     * @return SharedCNAME 共享 CNAME。
     */
    public String getSharedCNAME() {
        return this.SharedCNAME;
    }

    /**
     * Set 共享 CNAME。
     * @param SharedCNAME 共享 CNAME。
     */
    public void setSharedCNAME(String SharedCNAME) {
        this.SharedCNAME = SharedCNAME;
    }

    /**
     * Get 请输入调整后的描述。 
     * @return Description 请输入调整后的描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 请输入调整后的描述。
     * @param Description 请输入调整后的描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设置IP SSL 类型的共享CNAME 的 IP SSL 信息。 
     * @return IPSSLSetting 设置IP SSL 类型的共享CNAME 的 IP SSL 信息。
     */
    public IPSSLSetting getIPSSLSetting() {
        return this.IPSSLSetting;
    }

    /**
     * Set 设置IP SSL 类型的共享CNAME 的 IP SSL 信息。
     * @param IPSSLSetting 设置IP SSL 类型的共享CNAME 的 IP SSL 信息。
     */
    public void setIPSSLSetting(IPSSLSetting IPSSLSetting) {
        this.IPSSLSetting = IPSSLSetting;
    }

    public ModifySharedCNAMERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySharedCNAMERequest(ModifySharedCNAMERequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SharedCNAME != null) {
            this.SharedCNAME = new String(source.SharedCNAME);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IPSSLSetting != null) {
            this.IPSSLSetting = new IPSSLSetting(source.IPSSLSetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SharedCNAME", this.SharedCNAME);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "IPSSLSetting.", this.IPSSLSetting);

    }
}

