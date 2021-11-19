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

public class ShareCname extends AbstractModel{

    /**
    * ShareCname 配置开关, 开关为off时，域名使用默认CNAME，若需要使用共享CNAME，将开关置为on.

* ShareCname 为内测功能,如需使用,请联系腾讯云工程师开白.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 设置共享CNAME.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
     * Get ShareCname 配置开关, 开关为off时，域名使用默认CNAME，若需要使用共享CNAME，将开关置为on.

* ShareCname 为内测功能,如需使用,请联系腾讯云工程师开白. 
     * @return Switch ShareCname 配置开关, 开关为off时，域名使用默认CNAME，若需要使用共享CNAME，将开关置为on.

* ShareCname 为内测功能,如需使用,请联系腾讯云工程师开白.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set ShareCname 配置开关, 开关为off时，域名使用默认CNAME，若需要使用共享CNAME，将开关置为on.

* ShareCname 为内测功能,如需使用,请联系腾讯云工程师开白.
     * @param Switch ShareCname 配置开关, 开关为off时，域名使用默认CNAME，若需要使用共享CNAME，将开关置为on.

* ShareCname 为内测功能,如需使用,请联系腾讯云工程师开白.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 设置共享CNAME.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cname 设置共享CNAME.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 设置共享CNAME.
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cname 设置共享CNAME.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public ShareCname() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareCname(ShareCname source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Cname", this.Cname);

    }
}

