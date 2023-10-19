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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwnershipVerification extends AbstractModel {

    /**
    * CNAME 接入，使用 DNS 解析验证时所需的信息。详情参考 [站点/域名归属权验证
](https://cloud.tencent.com/document/product/1552/70789#7af6ecf8-afca-4e35-8811-b5797ed1bde5)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DnsVerification")
    @Expose
    private DnsVerification DnsVerification;

    /**
    * CNAME 接入，使用文件验证时所需的信息。详情参考 [站点/域名归属权验证
](https://cloud.tencent.com/document/product/1552/70789#7af6ecf8-afca-4e35-8811-b5797ed1bde5)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileVerification")
    @Expose
    private FileVerification FileVerification;

    /**
    * NS 接入，切换 DNS 服务器所需的信息。详情参考 [修改 DNS 服务器](https://cloud.tencent.com/document/product/1552/90452)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NsVerification")
    @Expose
    private NsVerification NsVerification;

    /**
     * Get CNAME 接入，使用 DNS 解析验证时所需的信息。详情参考 [站点/域名归属权验证
](https://cloud.tencent.com/document/product/1552/70789#7af6ecf8-afca-4e35-8811-b5797ed1bde5)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DnsVerification CNAME 接入，使用 DNS 解析验证时所需的信息。详情参考 [站点/域名归属权验证
](https://cloud.tencent.com/document/product/1552/70789#7af6ecf8-afca-4e35-8811-b5797ed1bde5)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DnsVerification getDnsVerification() {
        return this.DnsVerification;
    }

    /**
     * Set CNAME 接入，使用 DNS 解析验证时所需的信息。详情参考 [站点/域名归属权验证
](https://cloud.tencent.com/document/product/1552/70789#7af6ecf8-afca-4e35-8811-b5797ed1bde5)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DnsVerification CNAME 接入，使用 DNS 解析验证时所需的信息。详情参考 [站点/域名归属权验证
](https://cloud.tencent.com/document/product/1552/70789#7af6ecf8-afca-4e35-8811-b5797ed1bde5)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDnsVerification(DnsVerification DnsVerification) {
        this.DnsVerification = DnsVerification;
    }

    /**
     * Get CNAME 接入，使用文件验证时所需的信息。详情参考 [站点/域名归属权验证
](https://cloud.tencent.com/document/product/1552/70789#7af6ecf8-afca-4e35-8811-b5797ed1bde5)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileVerification CNAME 接入，使用文件验证时所需的信息。详情参考 [站点/域名归属权验证
](https://cloud.tencent.com/document/product/1552/70789#7af6ecf8-afca-4e35-8811-b5797ed1bde5)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileVerification getFileVerification() {
        return this.FileVerification;
    }

    /**
     * Set CNAME 接入，使用文件验证时所需的信息。详情参考 [站点/域名归属权验证
](https://cloud.tencent.com/document/product/1552/70789#7af6ecf8-afca-4e35-8811-b5797ed1bde5)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileVerification CNAME 接入，使用文件验证时所需的信息。详情参考 [站点/域名归属权验证
](https://cloud.tencent.com/document/product/1552/70789#7af6ecf8-afca-4e35-8811-b5797ed1bde5)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileVerification(FileVerification FileVerification) {
        this.FileVerification = FileVerification;
    }

    /**
     * Get NS 接入，切换 DNS 服务器所需的信息。详情参考 [修改 DNS 服务器](https://cloud.tencent.com/document/product/1552/90452)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NsVerification NS 接入，切换 DNS 服务器所需的信息。详情参考 [修改 DNS 服务器](https://cloud.tencent.com/document/product/1552/90452)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NsVerification getNsVerification() {
        return this.NsVerification;
    }

    /**
     * Set NS 接入，切换 DNS 服务器所需的信息。详情参考 [修改 DNS 服务器](https://cloud.tencent.com/document/product/1552/90452)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NsVerification NS 接入，切换 DNS 服务器所需的信息。详情参考 [修改 DNS 服务器](https://cloud.tencent.com/document/product/1552/90452)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNsVerification(NsVerification NsVerification) {
        this.NsVerification = NsVerification;
    }

    public OwnershipVerification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwnershipVerification(OwnershipVerification source) {
        if (source.DnsVerification != null) {
            this.DnsVerification = new DnsVerification(source.DnsVerification);
        }
        if (source.FileVerification != null) {
            this.FileVerification = new FileVerification(source.FileVerification);
        }
        if (source.NsVerification != null) {
            this.NsVerification = new NsVerification(source.NsVerification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DnsVerification.", this.DnsVerification);
        this.setParamObj(map, prefix + "FileVerification.", this.FileVerification);
        this.setParamObj(map, prefix + "NsVerification.", this.NsVerification);

    }
}

