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

public class OrderModifyObject extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 新产品标识,这里支持PRO_VERSION 专业版,FLAGSHIP 旗舰版
    */
    @SerializedName("NewSubProductCode")
    @Expose
    private String NewSubProductCode;

    /**
    * 扩容/缩容数,变配子产品忽略该参数
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 新产品标识,这里支持PRO_VERSION 专业版,FLAGSHIP 旗舰版 
     * @return NewSubProductCode 新产品标识,这里支持PRO_VERSION 专业版,FLAGSHIP 旗舰版
     */
    public String getNewSubProductCode() {
        return this.NewSubProductCode;
    }

    /**
     * Set 新产品标识,这里支持PRO_VERSION 专业版,FLAGSHIP 旗舰版
     * @param NewSubProductCode 新产品标识,这里支持PRO_VERSION 专业版,FLAGSHIP 旗舰版
     */
    public void setNewSubProductCode(String NewSubProductCode) {
        this.NewSubProductCode = NewSubProductCode;
    }

    /**
     * Get 扩容/缩容数,变配子产品忽略该参数 
     * @return InquireNum 扩容/缩容数,变配子产品忽略该参数
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set 扩容/缩容数,变配子产品忽略该参数
     * @param InquireNum 扩容/缩容数,变配子产品忽略该参数
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    public OrderModifyObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderModifyObject(OrderModifyObject source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.NewSubProductCode != null) {
            this.NewSubProductCode = new String(source.NewSubProductCode);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "NewSubProductCode", this.NewSubProductCode);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);

    }
}

