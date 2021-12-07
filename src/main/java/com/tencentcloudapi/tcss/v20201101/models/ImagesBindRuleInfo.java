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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImagesBindRuleInfo extends AbstractModel{

    /**
    * 镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 关联容器数量
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * 绑定规则id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 镜像大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
     * Get 镜像id 
     * @return ImageId 镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id
     * @param ImageId 镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 关联容器数量 
     * @return ContainerCnt 关联容器数量
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set 关联容器数量
     * @param ContainerCnt 关联容器数量
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get 绑定规则id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 绑定规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 绑定规则id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 绑定规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 镜像大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageSize 镜像大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 镜像大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSize 镜像大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    public ImagesBindRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImagesBindRuleInfo(ImagesBindRuleInfo source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);

    }
}

