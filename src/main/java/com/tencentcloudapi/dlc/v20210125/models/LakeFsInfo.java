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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SpaceUsedSize", this.SpaceUsedSize);
        this.setParamSimple(map, prefix + "CreateTimeStamp", this.CreateTimeStamp);

    }
}

