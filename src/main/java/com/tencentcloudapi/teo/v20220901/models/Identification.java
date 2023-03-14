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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Identification extends AbstractModel{

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 验证子域名。验证站点时，该值为空。验证子域名是为具体子域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 验证状态，取值有：
<li> pending：验证中；</li>
<li> finished：验证完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 站点归属权校验：Dns校验信息。
    */
    @SerializedName("Ascription")
    @Expose
    private AscriptionInfo Ascription;

    /**
    * 域名当前的 NS 记录。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * 站点归属权校验：文件校验信息。
    */
    @SerializedName("FileAscription")
    @Expose
    private FileAscriptionInfo FileAscription;

    /**
     * Get 站点名称。 
     * @return ZoneName 站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
     * @param ZoneName 站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 验证子域名。验证站点时，该值为空。验证子域名是为具体子域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 验证子域名。验证站点时，该值为空。验证子域名是为具体子域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 验证子域名。验证站点时，该值为空。验证子域名是为具体子域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 验证子域名。验证站点时，该值为空。验证子域名是为具体子域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 验证状态，取值有：
<li> pending：验证中；</li>
<li> finished：验证完成。</li> 
     * @return Status 验证状态，取值有：
<li> pending：验证中；</li>
<li> finished：验证完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 验证状态，取值有：
<li> pending：验证中；</li>
<li> finished：验证完成。</li>
     * @param Status 验证状态，取值有：
<li> pending：验证中；</li>
<li> finished：验证完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 站点归属权校验：Dns校验信息。 
     * @return Ascription 站点归属权校验：Dns校验信息。
     */
    public AscriptionInfo getAscription() {
        return this.Ascription;
    }

    /**
     * Set 站点归属权校验：Dns校验信息。
     * @param Ascription 站点归属权校验：Dns校验信息。
     */
    public void setAscription(AscriptionInfo Ascription) {
        this.Ascription = Ascription;
    }

    /**
     * Get 域名当前的 NS 记录。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalNameServers 域名当前的 NS 记录。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set 域名当前的 NS 记录。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalNameServers 域名当前的 NS 记录。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get 站点归属权校验：文件校验信息。 
     * @return FileAscription 站点归属权校验：文件校验信息。
     */
    public FileAscriptionInfo getFileAscription() {
        return this.FileAscription;
    }

    /**
     * Set 站点归属权校验：文件校验信息。
     * @param FileAscription 站点归属权校验：文件校验信息。
     */
    public void setFileAscription(FileAscriptionInfo FileAscription) {
        this.FileAscription = FileAscription;
    }

    public Identification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Identification(Identification source) {
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Ascription != null) {
            this.Ascription = new AscriptionInfo(source.Ascription);
        }
        if (source.OriginalNameServers != null) {
            this.OriginalNameServers = new String[source.OriginalNameServers.length];
            for (int i = 0; i < source.OriginalNameServers.length; i++) {
                this.OriginalNameServers[i] = new String(source.OriginalNameServers[i]);
            }
        }
        if (source.FileAscription != null) {
            this.FileAscription = new FileAscriptionInfo(source.FileAscription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Ascription.", this.Ascription);
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamObj(map, prefix + "FileAscription.", this.FileAscription);

    }
}

