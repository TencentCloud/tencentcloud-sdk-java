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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LakeFsInfo extends AbstractModel {

    /**
    * 托管存储名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 托管存储类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 容量
    */
    @SerializedName("SpaceUsedSize")
    @Expose
    private Float SpaceUsedSize;

    /**
    * 创建时候的时间戳
    */
    @SerializedName("CreateTimeStamp")
    @Expose
    private Long CreateTimeStamp;

    /**
    * 是否是用户默认桶，0：默认桶，1：非默认桶
    */
    @SerializedName("DefaultBucket")
    @Expose
    private Long DefaultBucket;

    /**
    * 托管存储short name
    */
    @SerializedName("ShortName")
    @Expose
    private String ShortName;

    /**
    * 桶描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 托管桶状态，当前取值为：creating、bind、readOnly、isolate
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 托管存储名称 
     * @return Name 托管存储名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 托管存储名称
     * @param Name 托管存储名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 托管存储类型 
     * @return Type 托管存储类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 托管存储类型
     * @param Type 托管存储类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 容量 
     * @return SpaceUsedSize 容量
     */
    public Float getSpaceUsedSize() {
        return this.SpaceUsedSize;
    }

    /**
     * Set 容量
     * @param SpaceUsedSize 容量
     */
    public void setSpaceUsedSize(Float SpaceUsedSize) {
        this.SpaceUsedSize = SpaceUsedSize;
    }

    /**
     * Get 创建时候的时间戳 
     * @return CreateTimeStamp 创建时候的时间戳
     */
    public Long getCreateTimeStamp() {
        return this.CreateTimeStamp;
    }

    /**
     * Set 创建时候的时间戳
     * @param CreateTimeStamp 创建时候的时间戳
     */
    public void setCreateTimeStamp(Long CreateTimeStamp) {
        this.CreateTimeStamp = CreateTimeStamp;
    }

    /**
     * Get 是否是用户默认桶，0：默认桶，1：非默认桶 
     * @return DefaultBucket 是否是用户默认桶，0：默认桶，1：非默认桶
     */
    public Long getDefaultBucket() {
        return this.DefaultBucket;
    }

    /**
     * Set 是否是用户默认桶，0：默认桶，1：非默认桶
     * @param DefaultBucket 是否是用户默认桶，0：默认桶，1：非默认桶
     */
    public void setDefaultBucket(Long DefaultBucket) {
        this.DefaultBucket = DefaultBucket;
    }

    /**
     * Get 托管存储short name 
     * @return ShortName 托管存储short name
     */
    public String getShortName() {
        return this.ShortName;
    }

    /**
     * Set 托管存储short name
     * @param ShortName 托管存储short name
     */
    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }

    /**
     * Get 桶描述信息 
     * @return Description 桶描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 桶描述信息
     * @param Description 桶描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 托管桶状态，当前取值为：creating、bind、readOnly、isolate 
     * @return Status 托管桶状态，当前取值为：creating、bind、readOnly、isolate
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 托管桶状态，当前取值为：creating、bind、readOnly、isolate
     * @param Status 托管桶状态，当前取值为：creating、bind、readOnly、isolate
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    }
}

