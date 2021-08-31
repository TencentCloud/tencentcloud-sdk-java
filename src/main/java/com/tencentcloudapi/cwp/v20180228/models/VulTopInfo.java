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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulTopInfo extends AbstractModel{

    /**
    * 漏洞 名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 危害等级：1-低危；2-中危；3-高危；4-严重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulLevel")
    @Expose
    private Long VulLevel;

    /**
    * 漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
     * Get 漏洞 名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulName 漏洞 名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞 名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulName 漏洞 名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 危害等级：1-低危；2-中危；3-高危；4-严重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulLevel 危害等级：1-低危；2-中危；3-高危；4-严重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set 危害等级：1-低危；2-中危；3-高危；4-严重
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulLevel 危害等级：1-低危；2-中危；3-高危；4-严重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulLevel(Long VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get 漏洞数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulCount 漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set 漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulCount 漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get 漏洞id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulId 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulId 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    public VulTopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulTopInfo(VulTopInfo source) {
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulLevel != null) {
            this.VulLevel = new Long(source.VulLevel);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamSimple(map, prefix + "VulId", this.VulId);

    }
}

