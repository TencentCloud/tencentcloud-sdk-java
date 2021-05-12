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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForceRedirect extends AbstractModel{

    /**
    * 访问强制跳转配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 访问强制跳转类型
http：强制 http 跳转
https：强制 https 跳转
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectType")
    @Expose
    private String RedirectType;

    /**
    * 强制跳转时返回状态码 
支持 301、302
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectStatusCode")
    @Expose
    private Long RedirectStatusCode;

    /**
    * 强制跳转时是否返回增加的头部。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CarryHeaders")
    @Expose
    private String CarryHeaders;

    /**
     * Get 访问强制跳转配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 访问强制跳转配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 访问强制跳转配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 访问强制跳转配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 访问强制跳转类型
http：强制 http 跳转
https：强制 https 跳转
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectType 访问强制跳转类型
http：强制 http 跳转
https：强制 https 跳转
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRedirectType() {
        return this.RedirectType;
    }

    /**
     * Set 访问强制跳转类型
http：强制 http 跳转
https：强制 https 跳转
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectType 访问强制跳转类型
http：强制 http 跳转
https：强制 https 跳转
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectType(String RedirectType) {
        this.RedirectType = RedirectType;
    }

    /**
     * Get 强制跳转时返回状态码 
支持 301、302
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectStatusCode 强制跳转时返回状态码 
支持 301、302
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRedirectStatusCode() {
        return this.RedirectStatusCode;
    }

    /**
     * Set 强制跳转时返回状态码 
支持 301、302
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectStatusCode 强制跳转时返回状态码 
支持 301、302
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectStatusCode(Long RedirectStatusCode) {
        this.RedirectStatusCode = RedirectStatusCode;
    }

    /**
     * Get 强制跳转时是否返回增加的头部。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CarryHeaders 强制跳转时是否返回增加的头部。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCarryHeaders() {
        return this.CarryHeaders;
    }

    /**
     * Set 强制跳转时是否返回增加的头部。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CarryHeaders 强制跳转时是否返回增加的头部。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCarryHeaders(String CarryHeaders) {
        this.CarryHeaders = CarryHeaders;
    }

    public ForceRedirect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForceRedirect(ForceRedirect source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RedirectType != null) {
            this.RedirectType = new String(source.RedirectType);
        }
        if (source.RedirectStatusCode != null) {
            this.RedirectStatusCode = new Long(source.RedirectStatusCode);
        }
        if (source.CarryHeaders != null) {
            this.CarryHeaders = new String(source.CarryHeaders);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "RedirectType", this.RedirectType);
        this.setParamSimple(map, prefix + "RedirectStatusCode", this.RedirectStatusCode);
        this.setParamSimple(map, prefix + "CarryHeaders", this.CarryHeaders);

    }
}

