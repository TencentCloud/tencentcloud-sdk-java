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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LakeFsInfo extends AbstractModel {

    /**
    * <p>托管存储名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>托管存储类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>存储用量</p>
    */
    @SerializedName("SpaceUsedSize")
    @Expose
    private Float SpaceUsedSize;

    /**
    * <p>创建时候的时间戳</p>
    */
    @SerializedName("CreateTimeStamp")
    @Expose
    private Long CreateTimeStamp;

    /**
    * <p>是否是用户默认桶，0：默认桶，1：非默认桶</p>
    */
    @SerializedName("DefaultBucket")
    @Expose
    private Long DefaultBucket;

    /**
    * <p>托管存储short name</p>
    */
    @SerializedName("ShortName")
    @Expose
    private String ShortName;

    /**
    * <p>桶描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>托管桶状态，当前取值为：creating、bind、readOnly、isolate</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>托管存储桶标签列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * <p>是否是多AZ存储桶</p>
    */
    @SerializedName("MultiAZ")
    @Expose
    private Boolean MultiAZ;

    /**
    * <p>存储桶配置信息</p>
    */
    @SerializedName("Configuration")
    @Expose
    private KVPair [] Configuration;

    /**
     * Get <p>托管存储名称</p> 
     * @return Name <p>托管存储名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>托管存储名称</p>
     * @param Name <p>托管存储名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>托管存储类型</p> 
     * @return Type <p>托管存储类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>托管存储类型</p>
     * @param Type <p>托管存储类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>存储用量</p> 
     * @return SpaceUsedSize <p>存储用量</p>
     */
    public Float getSpaceUsedSize() {
        return this.SpaceUsedSize;
    }

    /**
     * Set <p>存储用量</p>
     * @param SpaceUsedSize <p>存储用量</p>
     */
    public void setSpaceUsedSize(Float SpaceUsedSize) {
        this.SpaceUsedSize = SpaceUsedSize;
    }

    /**
     * Get <p>创建时候的时间戳</p> 
     * @return CreateTimeStamp <p>创建时候的时间戳</p>
     */
    public Long getCreateTimeStamp() {
        return this.CreateTimeStamp;
    }

    /**
     * Set <p>创建时候的时间戳</p>
     * @param CreateTimeStamp <p>创建时候的时间戳</p>
     */
    public void setCreateTimeStamp(Long CreateTimeStamp) {
        this.CreateTimeStamp = CreateTimeStamp;
    }

    /**
     * Get <p>是否是用户默认桶，0：默认桶，1：非默认桶</p> 
     * @return DefaultBucket <p>是否是用户默认桶，0：默认桶，1：非默认桶</p>
     */
    public Long getDefaultBucket() {
        return this.DefaultBucket;
    }

    /**
     * Set <p>是否是用户默认桶，0：默认桶，1：非默认桶</p>
     * @param DefaultBucket <p>是否是用户默认桶，0：默认桶，1：非默认桶</p>
     */
    public void setDefaultBucket(Long DefaultBucket) {
        this.DefaultBucket = DefaultBucket;
    }

    /**
     * Get <p>托管存储short name</p> 
     * @return ShortName <p>托管存储short name</p>
     */
    public String getShortName() {
        return this.ShortName;
    }

    /**
     * Set <p>托管存储short name</p>
     * @param ShortName <p>托管存储short name</p>
     */
    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }

    /**
     * Get <p>桶描述信息</p> 
     * @return Description <p>桶描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>桶描述信息</p>
     * @param Description <p>桶描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>托管桶状态，当前取值为：creating、bind、readOnly、isolate</p> 
     * @return Status <p>托管桶状态，当前取值为：creating、bind、readOnly、isolate</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>托管桶状态，当前取值为：creating、bind、readOnly、isolate</p>
     * @param Status <p>托管桶状态，当前取值为：creating、bind、readOnly、isolate</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>托管存储桶标签列表</p> 
     * @return TagList <p>托管存储桶标签列表</p>
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>托管存储桶标签列表</p>
     * @param TagList <p>托管存储桶标签列表</p>
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>是否是多AZ存储桶</p> 
     * @return MultiAZ <p>是否是多AZ存储桶</p>
     */
    public Boolean getMultiAZ() {
        return this.MultiAZ;
    }

    /**
     * Set <p>是否是多AZ存储桶</p>
     * @param MultiAZ <p>是否是多AZ存储桶</p>
     */
    public void setMultiAZ(Boolean MultiAZ) {
        this.MultiAZ = MultiAZ;
    }

    /**
     * Get <p>存储桶配置信息</p> 
     * @return Configuration <p>存储桶配置信息</p>
     */
    public KVPair [] getConfiguration() {
        return this.Configuration;
    }

    /**
     * Set <p>存储桶配置信息</p>
     * @param Configuration <p>存储桶配置信息</p>
     */
    public void setConfiguration(KVPair [] Configuration) {
        this.Configuration = Configuration;
    }

    public LakeFsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LakeFsInfo(LakeFsInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SpaceUsedSize != null) {
            this.SpaceUsedSize = new Float(source.SpaceUsedSize);
        }
        if (source.CreateTimeStamp != null) {
            this.CreateTimeStamp = new Long(source.CreateTimeStamp);
        }
        if (source.DefaultBucket != null) {
            this.DefaultBucket = new Long(source.DefaultBucket);
        }
        if (source.ShortName != null) {
            this.ShortName = new String(source.ShortName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.MultiAZ != null) {
            this.MultiAZ = new Boolean(source.MultiAZ);
        }
        if (source.Configuration != null) {
            this.Configuration = new KVPair[source.Configuration.length];
            for (int i = 0; i < source.Configuration.length; i++) {
                this.Configuration[i] = new KVPair(source.Configuration[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SpaceUsedSize", this.SpaceUsedSize);
        this.setParamSimple(map, prefix + "CreateTimeStamp", this.CreateTimeStamp);
        this.setParamSimple(map, prefix + "DefaultBucket", this.DefaultBucket);
        this.setParamSimple(map, prefix + "ShortName", this.ShortName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "MultiAZ", this.MultiAZ);
        this.setParamArrayObj(map, prefix + "Configuration.", this.Configuration);

    }
}

