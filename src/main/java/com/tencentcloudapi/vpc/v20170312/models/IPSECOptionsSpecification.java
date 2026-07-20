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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPSECOptionsSpecification extends AbstractModel {

    /**
    * <p>加密算法，可选值：&#39;3DES-CBC&#39;, &#39;AES-CBC-128&#39;, &#39;AES-CBC-192&#39;, &#39;AES-CBC-256&#39;, &#39;DES-CBC&#39;, &#39;SM4&#39;, &#39;NULL&#39;， 默认为AES-CBC-128</p>
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * <p>认证算法：可选值：&#39;MD5&#39;, &#39;SHA1&#39;，&#39;SHA-256&#39; 默认为</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntegrityAlgorith")
    @Expose
    private String IntegrityAlgorith;

    /**
    * <p>IPsec SA lifetime(s)</p><p>取值范围：[180, 604800]</p><p>单位：秒</p><p>默认值：14400</p>
    */
    @SerializedName("IPSECSaLifetimeSeconds")
    @Expose
    private Long IPSECSaLifetimeSeconds;

    /**
    * <p>PFS：可选值：&#39;NULL&#39;, &#39;DH-GROUP1&#39;, &#39;DH-GROUP2&#39;, &#39;DH-GROUP5&#39;, &#39;DH-GROUP14&#39;, &#39;DH-GROUP15&#39;,&#39;DH-GROUP16&#39;,&#39;DH-GROUP19&#39;,&#39;DH-GROUP20&#39;,&#39;DH-GROUP21&#39;,&#39;DH-GROUP24&#39;，默认为NULL</p>
    */
    @SerializedName("PfsDhGroup")
    @Expose
    private String PfsDhGroup;

    /**
    * <p>IPsec SA lifetime(KB)</p><p>取值范围：[2560, 4294967295]</p><p>单位：KB</p><p>默认值：4096000000</p>
    */
    @SerializedName("IPSECSaLifetimeTraffic")
    @Expose
    private Long IPSECSaLifetimeTraffic;

    /**
    * <p>认证算法：可选值：&#39;MD5&#39;, &#39;SHA1&#39;，&#39;SHA-256&#39; 默认为</p>
    */
    @SerializedName("IntegrityAlgorithm")
    @Expose
    private String IntegrityAlgorithm;

    /**
     * Get <p>加密算法，可选值：&#39;3DES-CBC&#39;, &#39;AES-CBC-128&#39;, &#39;AES-CBC-192&#39;, &#39;AES-CBC-256&#39;, &#39;DES-CBC&#39;, &#39;SM4&#39;, &#39;NULL&#39;， 默认为AES-CBC-128</p> 
     * @return EncryptAlgorithm <p>加密算法，可选值：&#39;3DES-CBC&#39;, &#39;AES-CBC-128&#39;, &#39;AES-CBC-192&#39;, &#39;AES-CBC-256&#39;, &#39;DES-CBC&#39;, &#39;SM4&#39;, &#39;NULL&#39;， 默认为AES-CBC-128</p>
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set <p>加密算法，可选值：&#39;3DES-CBC&#39;, &#39;AES-CBC-128&#39;, &#39;AES-CBC-192&#39;, &#39;AES-CBC-256&#39;, &#39;DES-CBC&#39;, &#39;SM4&#39;, &#39;NULL&#39;， 默认为AES-CBC-128</p>
     * @param EncryptAlgorithm <p>加密算法，可选值：&#39;3DES-CBC&#39;, &#39;AES-CBC-128&#39;, &#39;AES-CBC-192&#39;, &#39;AES-CBC-256&#39;, &#39;DES-CBC&#39;, &#39;SM4&#39;, &#39;NULL&#39;， 默认为AES-CBC-128</p>
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get <p>认证算法：可选值：&#39;MD5&#39;, &#39;SHA1&#39;，&#39;SHA-256&#39; 默认为</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntegrityAlgorith <p>认证算法：可选值：&#39;MD5&#39;, &#39;SHA1&#39;，&#39;SHA-256&#39; 默认为</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getIntegrityAlgorith() {
        return this.IntegrityAlgorith;
    }

    /**
     * Set <p>认证算法：可选值：&#39;MD5&#39;, &#39;SHA1&#39;，&#39;SHA-256&#39; 默认为</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntegrityAlgorith <p>认证算法：可选值：&#39;MD5&#39;, &#39;SHA1&#39;，&#39;SHA-256&#39; 默认为</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setIntegrityAlgorith(String IntegrityAlgorith) {
        this.IntegrityAlgorith = IntegrityAlgorith;
    }

    /**
     * Get <p>IPsec SA lifetime(s)</p><p>取值范围：[180, 604800]</p><p>单位：秒</p><p>默认值：14400</p> 
     * @return IPSECSaLifetimeSeconds <p>IPsec SA lifetime(s)</p><p>取值范围：[180, 604800]</p><p>单位：秒</p><p>默认值：14400</p>
     */
    public Long getIPSECSaLifetimeSeconds() {
        return this.IPSECSaLifetimeSeconds;
    }

    /**
     * Set <p>IPsec SA lifetime(s)</p><p>取值范围：[180, 604800]</p><p>单位：秒</p><p>默认值：14400</p>
     * @param IPSECSaLifetimeSeconds <p>IPsec SA lifetime(s)</p><p>取值范围：[180, 604800]</p><p>单位：秒</p><p>默认值：14400</p>
     */
    public void setIPSECSaLifetimeSeconds(Long IPSECSaLifetimeSeconds) {
        this.IPSECSaLifetimeSeconds = IPSECSaLifetimeSeconds;
    }

    /**
     * Get <p>PFS：可选值：&#39;NULL&#39;, &#39;DH-GROUP1&#39;, &#39;DH-GROUP2&#39;, &#39;DH-GROUP5&#39;, &#39;DH-GROUP14&#39;, &#39;DH-GROUP15&#39;,&#39;DH-GROUP16&#39;,&#39;DH-GROUP19&#39;,&#39;DH-GROUP20&#39;,&#39;DH-GROUP21&#39;,&#39;DH-GROUP24&#39;，默认为NULL</p> 
     * @return PfsDhGroup <p>PFS：可选值：&#39;NULL&#39;, &#39;DH-GROUP1&#39;, &#39;DH-GROUP2&#39;, &#39;DH-GROUP5&#39;, &#39;DH-GROUP14&#39;, &#39;DH-GROUP15&#39;,&#39;DH-GROUP16&#39;,&#39;DH-GROUP19&#39;,&#39;DH-GROUP20&#39;,&#39;DH-GROUP21&#39;,&#39;DH-GROUP24&#39;，默认为NULL</p>
     */
    public String getPfsDhGroup() {
        return this.PfsDhGroup;
    }

    /**
     * Set <p>PFS：可选值：&#39;NULL&#39;, &#39;DH-GROUP1&#39;, &#39;DH-GROUP2&#39;, &#39;DH-GROUP5&#39;, &#39;DH-GROUP14&#39;, &#39;DH-GROUP15&#39;,&#39;DH-GROUP16&#39;,&#39;DH-GROUP19&#39;,&#39;DH-GROUP20&#39;,&#39;DH-GROUP21&#39;,&#39;DH-GROUP24&#39;，默认为NULL</p>
     * @param PfsDhGroup <p>PFS：可选值：&#39;NULL&#39;, &#39;DH-GROUP1&#39;, &#39;DH-GROUP2&#39;, &#39;DH-GROUP5&#39;, &#39;DH-GROUP14&#39;, &#39;DH-GROUP15&#39;,&#39;DH-GROUP16&#39;,&#39;DH-GROUP19&#39;,&#39;DH-GROUP20&#39;,&#39;DH-GROUP21&#39;,&#39;DH-GROUP24&#39;，默认为NULL</p>
     */
    public void setPfsDhGroup(String PfsDhGroup) {
        this.PfsDhGroup = PfsDhGroup;
    }

    /**
     * Get <p>IPsec SA lifetime(KB)</p><p>取值范围：[2560, 4294967295]</p><p>单位：KB</p><p>默认值：4096000000</p> 
     * @return IPSECSaLifetimeTraffic <p>IPsec SA lifetime(KB)</p><p>取值范围：[2560, 4294967295]</p><p>单位：KB</p><p>默认值：4096000000</p>
     */
    public Long getIPSECSaLifetimeTraffic() {
        return this.IPSECSaLifetimeTraffic;
    }

    /**
     * Set <p>IPsec SA lifetime(KB)</p><p>取值范围：[2560, 4294967295]</p><p>单位：KB</p><p>默认值：4096000000</p>
     * @param IPSECSaLifetimeTraffic <p>IPsec SA lifetime(KB)</p><p>取值范围：[2560, 4294967295]</p><p>单位：KB</p><p>默认值：4096000000</p>
     */
    public void setIPSECSaLifetimeTraffic(Long IPSECSaLifetimeTraffic) {
        this.IPSECSaLifetimeTraffic = IPSECSaLifetimeTraffic;
    }

    /**
     * Get <p>认证算法：可选值：&#39;MD5&#39;, &#39;SHA1&#39;，&#39;SHA-256&#39; 默认为</p> 
     * @return IntegrityAlgorithm <p>认证算法：可选值：&#39;MD5&#39;, &#39;SHA1&#39;，&#39;SHA-256&#39; 默认为</p>
     */
    public String getIntegrityAlgorithm() {
        return this.IntegrityAlgorithm;
    }

    /**
     * Set <p>认证算法：可选值：&#39;MD5&#39;, &#39;SHA1&#39;，&#39;SHA-256&#39; 默认为</p>
     * @param IntegrityAlgorithm <p>认证算法：可选值：&#39;MD5&#39;, &#39;SHA1&#39;，&#39;SHA-256&#39; 默认为</p>
     */
    public void setIntegrityAlgorithm(String IntegrityAlgorithm) {
        this.IntegrityAlgorithm = IntegrityAlgorithm;
    }

    public IPSECOptionsSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPSECOptionsSpecification(IPSECOptionsSpecification source) {
        if (source.EncryptAlgorithm != null) {
            this.EncryptAlgorithm = new String(source.EncryptAlgorithm);
        }
        if (source.IntegrityAlgorith != null) {
            this.IntegrityAlgorith = new String(source.IntegrityAlgorith);
        }
        if (source.IPSECSaLifetimeSeconds != null) {
            this.IPSECSaLifetimeSeconds = new Long(source.IPSECSaLifetimeSeconds);
        }
        if (source.PfsDhGroup != null) {
            this.PfsDhGroup = new String(source.PfsDhGroup);
        }
        if (source.IPSECSaLifetimeTraffic != null) {
            this.IPSECSaLifetimeTraffic = new Long(source.IPSECSaLifetimeTraffic);
        }
        if (source.IntegrityAlgorithm != null) {
            this.IntegrityAlgorithm = new String(source.IntegrityAlgorithm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamSimple(map, prefix + "IntegrityAlgorith", this.IntegrityAlgorith);
        this.setParamSimple(map, prefix + "IPSECSaLifetimeSeconds", this.IPSECSaLifetimeSeconds);
        this.setParamSimple(map, prefix + "PfsDhGroup", this.PfsDhGroup);
        this.setParamSimple(map, prefix + "IPSECSaLifetimeTraffic", this.IPSECSaLifetimeTraffic);
        this.setParamSimple(map, prefix + "IntegrityAlgorithm", this.IntegrityAlgorithm);

    }
}

