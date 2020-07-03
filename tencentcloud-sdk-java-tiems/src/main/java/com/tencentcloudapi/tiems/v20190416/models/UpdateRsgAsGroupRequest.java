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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRsgAsGroupRequest extends AbstractModel{

    /**
    * 伸缩组 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 重命名名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 伸缩组最大节点数
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 伸缩组最小节点数
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 伸缩组期望的节点数
    */
    @SerializedName("DesiredSize")
    @Expose
    private Long DesiredSize;

    /**
     * Get 伸缩组 ID 
     * @return Id 伸缩组 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 伸缩组 ID
     * @param Id 伸缩组 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 重命名名称 
     * @return Name 重命名名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 重命名名称
     * @param Name 重命名名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 伸缩组最大节点数 
     * @return MaxSize 伸缩组最大节点数
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 伸缩组最大节点数
     * @param MaxSize 伸缩组最大节点数
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 伸缩组最小节点数 
     * @return MinSize 伸缩组最小节点数
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 伸缩组最小节点数
     * @param MinSize 伸缩组最小节点数
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 伸缩组期望的节点数 
     * @return DesiredSize 伸缩组期望的节点数
     */
    public Long getDesiredSize() {
        return this.DesiredSize;
    }

    /**
     * Set 伸缩组期望的节点数
     * @param DesiredSize 伸缩组期望的节点数
     */
    public void setDesiredSize(Long DesiredSize) {
        this.DesiredSize = DesiredSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "DesiredSize", this.DesiredSize);

    }
}

