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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpGet extends AbstractModel{

    /**
    * HttpGet检测的路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * HttpGet检测的端口号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * HTTP or HTTPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
     * Get HttpGet检测的路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path HttpGet检测的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set HttpGet检测的路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path HttpGet检测的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get HttpGet检测的端口号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port HttpGet检测的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set HttpGet检测的端口号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port HttpGet检测的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get HTTP or HTTPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheme HTTP or HTTPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set HTTP or HTTPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheme HTTP or HTTPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    public HttpGet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpGet(HttpGet source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);

    }
}

