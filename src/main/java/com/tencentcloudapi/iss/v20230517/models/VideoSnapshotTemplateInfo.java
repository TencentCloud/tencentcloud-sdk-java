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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoSnapshotTemplateInfo extends AbstractModel {

    /**
    * <p>截图模板Id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>截图模板名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>截帧频率</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>多张模式</p>
    */
    @SerializedName("MultiMode")
    @Expose
    private MultiVideoSnapshotMode MultiMode;

    /**
    * <p>生效时段</p>
    */
    @SerializedName("Times")
    @Expose
    private EffectiveTime [] Times;

    /**
    * <p>模板关联的配置数</p>
    */
    @SerializedName("RelatedConfigCount")
    @Expose
    private Long RelatedConfigCount;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近一次更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>截图模板Id</p> 
     * @return TemplateId <p>截图模板Id</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>截图模板Id</p>
     * @param TemplateId <p>截图模板Id</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>截图模板名称</p> 
     * @return Name <p>截图模板名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>截图模板名称</p>
     * @param Name <p>截图模板名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul> 
     * @return Type <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     * @param Type <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>截帧频率</p> 
     * @return Interval <p>截帧频率</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>截帧频率</p>
     * @param Interval <p>截帧频率</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>多张模式</p> 
     * @return MultiMode <p>多张模式</p>
     */
    public MultiVideoSnapshotMode getMultiMode() {
        return this.MultiMode;
    }

    /**
     * Set <p>多张模式</p>
     * @param MultiMode <p>多张模式</p>
     */
    public void setMultiMode(MultiVideoSnapshotMode MultiMode) {
        this.MultiMode = MultiMode;
    }

    /**
     * Get <p>生效时段</p> 
     * @return Times <p>生效时段</p>
     */
    public EffectiveTime [] getTimes() {
        return this.Times;
    }

    /**
     * Set <p>生效时段</p>
     * @param Times <p>生效时段</p>
     */
    public void setTimes(EffectiveTime [] Times) {
        this.Times = Times;
    }

    /**
     * Get <p>模板关联的配置数</p> 
     * @return RelatedConfigCount <p>模板关联的配置数</p>
     */
    public Long getRelatedConfigCount() {
        return this.RelatedConfigCount;
    }

    /**
     * Set <p>模板关联的配置数</p>
     * @param RelatedConfigCount <p>模板关联的配置数</p>
     */
    public void setRelatedConfigCount(Long RelatedConfigCount) {
        this.RelatedConfigCount = RelatedConfigCount;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近一次更新时间</p> 
     * @return UpdateTime <p>最近一次更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最近一次更新时间</p>
     * @param UpdateTime <p>最近一次更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public VideoSnapshotTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoSnapshotTemplateInfo(VideoSnapshotTemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.MultiMode != null) {
            this.MultiMode = new MultiVideoSnapshotMode(source.MultiMode);
        }
        if (source.Times != null) {
            this.Times = new EffectiveTime[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new EffectiveTime(source.Times[i]);
            }
        }
        if (source.RelatedConfigCount != null) {
            this.RelatedConfigCount = new Long(source.RelatedConfigCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamObj(map, prefix + "MultiMode.", this.MultiMode);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);
        this.setParamSimple(map, prefix + "RelatedConfigCount", this.RelatedConfigCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

