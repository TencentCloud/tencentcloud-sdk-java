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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GooseFSxAttribute extends AbstractModel {

    /**
    * GooseFSx的型号
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 容量单位是GB, 例如4608(4.5TB)
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * 要关联映射的bucket列表
    */
    @SerializedName("MappedBucketList")
    @Expose
    private MappedBucket [] MappedBucketList;

    /**
    * 客户侧管理节点信息
    */
    @SerializedName("ClientManagerNodeList")
    @Expose
    private ClientClusterManagerNodeInfo [] ClientManagerNodeList;

    /**
     * Get GooseFSx的型号 
     * @return Model GooseFSx的型号
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set GooseFSx的型号
     * @param Model GooseFSx的型号
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 容量单位是GB, 例如4608(4.5TB) 
     * @return Capacity 容量单位是GB, 例如4608(4.5TB)
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set 容量单位是GB, 例如4608(4.5TB)
     * @param Capacity 容量单位是GB, 例如4608(4.5TB)
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get 要关联映射的bucket列表 
     * @return MappedBucketList 要关联映射的bucket列表
     */
    public MappedBucket [] getMappedBucketList() {
        return this.MappedBucketList;
    }

    /**
     * Set 要关联映射的bucket列表
     * @param MappedBucketList 要关联映射的bucket列表
     */
    public void setMappedBucketList(MappedBucket [] MappedBucketList) {
        this.MappedBucketList = MappedBucketList;
    }

    /**
     * Get 客户侧管理节点信息 
     * @return ClientManagerNodeList 客户侧管理节点信息
     */
    public ClientClusterManagerNodeInfo [] getClientManagerNodeList() {
        return this.ClientManagerNodeList;
    }

    /**
     * Set 客户侧管理节点信息
     * @param ClientManagerNodeList 客户侧管理节点信息
     */
    public void setClientManagerNodeList(ClientClusterManagerNodeInfo [] ClientManagerNodeList) {
        this.ClientManagerNodeList = ClientManagerNodeList;
    }

    public GooseFSxAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GooseFSxAttribute(GooseFSxAttribute source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.MappedBucketList != null) {
            this.MappedBucketList = new MappedBucket[source.MappedBucketList.length];
            for (int i = 0; i < source.MappedBucketList.length; i++) {
                this.MappedBucketList[i] = new MappedBucket(source.MappedBucketList[i]);
            }
        }
        if (source.ClientManagerNodeList != null) {
            this.ClientManagerNodeList = new ClientClusterManagerNodeInfo[source.ClientManagerNodeList.length];
            for (int i = 0; i < source.ClientManagerNodeList.length; i++) {
                this.ClientManagerNodeList[i] = new ClientClusterManagerNodeInfo(source.ClientManagerNodeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamArrayObj(map, prefix + "MappedBucketList.", this.MappedBucketList);
        this.setParamArrayObj(map, prefix + "ClientManagerNodeList.", this.ClientManagerNodeList);

    }
}

