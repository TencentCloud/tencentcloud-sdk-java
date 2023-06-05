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

public class OriginSni extends AbstractModel{

    /**
    * 是否开启HTTPS回源SNI。
开启：on，
关闭：off
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 回源域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
     * Get 是否开启HTTPS回源SNI。
开启：on，
关闭：off 
     * @return Switch 是否开启HTTPS回源SNI。
开启：on，
关闭：off
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是否开启HTTPS回源SNI。
开启：on，
关闭：off
     * @param Switch 是否开启HTTPS回源SNI。
开启：on，
关闭：off
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 回源域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerName 回源域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 回源域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerName 回源域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    public OriginSni() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginSni(OriginSni source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);

    }
}

