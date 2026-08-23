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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSensitiveInfo extends AbstractModel {

    /**
    * <p>敏感信息行为类型</p><p>枚举值：</p><ul><li>1： 以root账号启动</li><li>2： 代码泄露</li><li>3： 凭据泄露</li></ul>
    */
    @SerializedName("Behavior")
    @Expose
    private Long Behavior;

    /**
    * <p>规则类型</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>风险级别</p><p>枚举值：</p><ul><li>1： 低风险</li><li>2： 中分线</li><li>3： 高风险</li><li>4： 严重风险</li></ul>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>风险描述</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>风险内容</p>
    */
    @SerializedName("InstructionContent")
    @Expose
    private String InstructionContent;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>影响镜像数</p>
    */
    @SerializedName("AffectImageCount")
    @Expose
    private Long AffectImageCount;

    /**
    * <p>镜像层Id</p>
    */
    @SerializedName("LayerId")
    @Expose
    private String LayerId;

    /**
    * <p>镜像Id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("FirstFoundTime")
    @Expose
    private String FirstFoundTime;

    /**
    * <p>最近发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * <p>镜像层序号</p>
    */
    @SerializedName("LayerIndex")
    @Expose
    private Long LayerIndex;

    /**
     * Get <p>敏感信息行为类型</p><p>枚举值：</p><ul><li>1： 以root账号启动</li><li>2： 代码泄露</li><li>3： 凭据泄露</li></ul> 
     * @return Behavior <p>敏感信息行为类型</p><p>枚举值：</p><ul><li>1： 以root账号启动</li><li>2： 代码泄露</li><li>3： 凭据泄露</li></ul>
     */
    public Long getBehavior() {
        return this.Behavior;
    }

    /**
     * Set <p>敏感信息行为类型</p><p>枚举值：</p><ul><li>1： 以root账号启动</li><li>2： 代码泄露</li><li>3： 凭据泄露</li></ul>
     * @param Behavior <p>敏感信息行为类型</p><p>枚举值：</p><ul><li>1： 以root账号启动</li><li>2： 代码泄露</li><li>3： 凭据泄露</li></ul>
     */
    public void setBehavior(Long Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get <p>规则类型</p> 
     * @return Type <p>规则类型</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>规则类型</p>
     * @param Type <p>规则类型</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>风险级别</p><p>枚举值：</p><ul><li>1： 低风险</li><li>2： 中分线</li><li>3： 高风险</li><li>4： 严重风险</li></ul> 
     * @return Level <p>风险级别</p><p>枚举值：</p><ul><li>1： 低风险</li><li>2： 中分线</li><li>3： 高风险</li><li>4： 严重风险</li></ul>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>风险级别</p><p>枚举值：</p><ul><li>1： 低风险</li><li>2： 中分线</li><li>3： 高风险</li><li>4： 严重风险</li></ul>
     * @param Level <p>风险级别</p><p>枚举值：</p><ul><li>1： 低风险</li><li>2： 中分线</li><li>3： 高风险</li><li>4： 严重风险</li></ul>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>风险描述</p> 
     * @return Describe <p>风险描述</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>风险描述</p>
     * @param Describe <p>风险描述</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>风险内容</p> 
     * @return InstructionContent <p>风险内容</p>
     */
    public String getInstructionContent() {
        return this.InstructionContent;
    }

    /**
     * Set <p>风险内容</p>
     * @param InstructionContent <p>风险内容</p>
     */
    public void setInstructionContent(String InstructionContent) {
        this.InstructionContent = InstructionContent;
    }

    /**
     * Get <p>镜像id</p> 
     * @return ImageId <p>镜像id</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageId <p>镜像id</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>所属账号名</p> 
     * @return OwnerAccountName <p>所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>所属账号名</p>
     * @param OwnerAccountName <p>所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>所属账号uin</p> 
     * @return OwnerUin <p>所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>所属账号uin</p>
     * @param OwnerUin <p>所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>所属账号appid</p> 
     * @return OwnerAppId <p>所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>所属账号appid</p>
     * @param OwnerAppId <p>所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>影响镜像数</p> 
     * @return AffectImageCount <p>影响镜像数</p>
     */
    public Long getAffectImageCount() {
        return this.AffectImageCount;
    }

    /**
     * Set <p>影响镜像数</p>
     * @param AffectImageCount <p>影响镜像数</p>
     */
    public void setAffectImageCount(Long AffectImageCount) {
        this.AffectImageCount = AffectImageCount;
    }

    /**
     * Get <p>镜像层Id</p> 
     * @return LayerId <p>镜像层Id</p>
     */
    public String getLayerId() {
        return this.LayerId;
    }

    /**
     * Set <p>镜像层Id</p>
     * @param LayerId <p>镜像层Id</p>
     */
    public void setLayerId(String LayerId) {
        this.LayerId = LayerId;
    }

    /**
     * Get <p>镜像Id</p> 
     * @return Id <p>镜像Id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>镜像Id</p>
     * @param Id <p>镜像Id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return FirstFoundTime <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getFirstFoundTime() {
        return this.FirstFoundTime;
    }

    /**
     * Set <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param FirstFoundTime <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setFirstFoundTime(String FirstFoundTime) {
        this.FirstFoundTime = FirstFoundTime;
    }

    /**
     * Get <p>最近发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestFoundTime <p>最近发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set <p>最近发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param LatestFoundTime <p>最近发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get <p>镜像层序号</p> 
     * @return LayerIndex <p>镜像层序号</p>
     */
    public Long getLayerIndex() {
        return this.LayerIndex;
    }

    /**
     * Set <p>镜像层序号</p>
     * @param LayerIndex <p>镜像层序号</p>
     */
    public void setLayerIndex(Long LayerIndex) {
        this.LayerIndex = LayerIndex;
    }

    public ImageSensitiveInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSensitiveInfo(ImageSensitiveInfo source) {
        if (source.Behavior != null) {
            this.Behavior = new Long(source.Behavior);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.InstructionContent != null) {
            this.InstructionContent = new String(source.InstructionContent);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.AffectImageCount != null) {
            this.AffectImageCount = new Long(source.AffectImageCount);
        }
        if (source.LayerId != null) {
            this.LayerId = new String(source.LayerId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FirstFoundTime != null) {
            this.FirstFoundTime = new String(source.FirstFoundTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.LayerIndex != null) {
            this.LayerIndex = new Long(source.LayerIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "InstructionContent", this.InstructionContent);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "AffectImageCount", this.AffectImageCount);
        this.setParamSimple(map, prefix + "LayerId", this.LayerId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FirstFoundTime", this.FirstFoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "LayerIndex", this.LayerIndex);

    }
}

