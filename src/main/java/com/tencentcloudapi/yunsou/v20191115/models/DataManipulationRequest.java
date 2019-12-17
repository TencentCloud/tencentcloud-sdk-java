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
package com.tencentcloudapi.yunsou.v20191115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataManipulationRequest extends AbstractModel{

    /**
    * 操作类型，add或del
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * 数据编码类型
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * 数据
    */
    @SerializedName("Contents")
    @Expose
    private String Contents;

    /**
    * 应用Id
    */
    @SerializedName("ResourceId")
    @Expose
    private Long ResourceId;

    /**
     * Get 操作类型，add或del 
     * @return OpType 操作类型，add或del
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set 操作类型，add或del
     * @param OpType 操作类型，add或del
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }

    /**
     * Get 数据编码类型 
     * @return Encoding 数据编码类型
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set 数据编码类型
     * @param Encoding 数据编码类型
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 数据 
     * @return Contents 数据
     */
    public String getContents() {
        return this.Contents;
    }

    /**
     * Set 数据
     * @param Contents 数据
     */
    public void setContents(String Contents) {
        this.Contents = Contents;
    }

    /**
     * Get 应用Id 
     * @return ResourceId 应用Id
     */
    public Long getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 应用Id
     * @param ResourceId 应用Id
     */
    public void setResourceId(Long ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "Contents", this.Contents);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

