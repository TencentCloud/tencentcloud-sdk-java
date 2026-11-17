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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwnershipVerification extends AbstractModel {

    /**
    * <p>DNS 校验</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DnsVerification")
    @Expose
    private DnsVerification DnsVerification;

    /**
    * <p>文件校验</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileVerification")
    @Expose
    private FileVerification FileVerification;

    /**
    * <p>NS 校验</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NsVerification")
    @Expose
    private NsVerification NsVerification;

    /**
     * Get <p>DNS 校验</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DnsVerification <p>DNS 校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DnsVerification getDnsVerification() {
        return this.DnsVerification;
    }

    /**
     * Set <p>DNS 校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DnsVerification <p>DNS 校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDnsVerification(DnsVerification DnsVerification) {
        this.DnsVerification = DnsVerification;
    }

    /**
     * Get <p>文件校验</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileVerification <p>文件校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileVerification getFileVerification() {
        return this.FileVerification;
    }

    /**
     * Set <p>文件校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileVerification <p>文件校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileVerification(FileVerification FileVerification) {
        this.FileVerification = FileVerification;
    }

    /**
     * Get <p>NS 校验</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NsVerification <p>NS 校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NsVerification getNsVerification() {
        return this.NsVerification;
    }

    /**
     * Set <p>NS 校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NsVerification <p>NS 校验</p>
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

