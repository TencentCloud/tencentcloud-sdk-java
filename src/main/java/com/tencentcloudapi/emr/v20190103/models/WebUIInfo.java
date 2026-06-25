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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebUIInfo extends AbstractModel {

    /**
    * <p>访问地址，可能为空</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>WebUI状态包括：<br>-1表示当前服务没有WebUI；<br>0表示当前服务有WebUI，但是没有安装KNOX服务；<br>1表示当前服务有WebUI并安装有KNOX服务，但是KNOX没有开启公网访问；<br>2表示，当前服务有WebUI，安装有KNOX服务且已开启公网访问。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebUIStatus")
    @Expose
    private Long WebUIStatus;

    /**
    * <p>服务名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get <p>访问地址，可能为空</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url <p>访问地址，可能为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>访问地址，可能为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url <p>访问地址，可能为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>WebUI状态包括：<br>-1表示当前服务没有WebUI；<br>0表示当前服务有WebUI，但是没有安装KNOX服务；<br>1表示当前服务有WebUI并安装有KNOX服务，但是KNOX没有开启公网访问；<br>2表示，当前服务有WebUI，安装有KNOX服务且已开启公网访问。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebUIStatus <p>WebUI状态包括：<br>-1表示当前服务没有WebUI；<br>0表示当前服务有WebUI，但是没有安装KNOX服务；<br>1表示当前服务有WebUI并安装有KNOX服务，但是KNOX没有开启公网访问；<br>2表示，当前服务有WebUI，安装有KNOX服务且已开启公网访问。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWebUIStatus() {
        return this.WebUIStatus;
    }

    /**
     * Set <p>WebUI状态包括：<br>-1表示当前服务没有WebUI；<br>0表示当前服务有WebUI，但是没有安装KNOX服务；<br>1表示当前服务有WebUI并安装有KNOX服务，但是KNOX没有开启公网访问；<br>2表示，当前服务有WebUI，安装有KNOX服务且已开启公网访问。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebUIStatus <p>WebUI状态包括：<br>-1表示当前服务没有WebUI；<br>0表示当前服务有WebUI，但是没有安装KNOX服务；<br>1表示当前服务有WebUI并安装有KNOX服务，但是KNOX没有开启公网访问；<br>2表示，当前服务有WebUI，安装有KNOX服务且已开启公网访问。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebUIStatus(Long WebUIStatus) {
        this.WebUIStatus = WebUIStatus;
    }

    /**
     * Get <p>服务名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName <p>服务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName <p>服务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public WebUIInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebUIInfo(WebUIInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.WebUIStatus != null) {
            this.WebUIStatus = new Long(source.WebUIStatus);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "WebUIStatus", this.WebUIStatus);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

