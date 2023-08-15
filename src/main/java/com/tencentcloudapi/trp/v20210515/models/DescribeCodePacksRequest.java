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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCodePacksRequest extends AbstractModel{

    /**
    * 每页数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 查询关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 是否有流水码 0:无 1:有
    */
    @SerializedName("SerialType")
    @Expose
    private Long SerialType;

    /**
    * 资源类型 batch:批次, order_in 入库, order_out: 出入
    */
    @SerializedName("ResType")
    @Expose
    private String ResType;

    /**
    * 资源ID ResType是 batch 时对应是批次ID, 是 order_in, order_out时，则是订单ID
    */
    @SerializedName("ResId")
    @Expose
    private String ResId;

    /**
     * Get 每页数量 
     * @return PageSize 每页数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量
     * @param PageSize 每页数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页数 
     * @return PageNumber 页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页数
     * @param PageNumber 页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 查询关键字 
     * @return Keyword 查询关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 查询关键字
     * @param Keyword 查询关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 是否有流水码 0:无 1:有 
     * @return SerialType 是否有流水码 0:无 1:有
     */
    public Long getSerialType() {
        return this.SerialType;
    }

    /**
     * Set 是否有流水码 0:无 1:有
     * @param SerialType 是否有流水码 0:无 1:有
     */
    public void setSerialType(Long SerialType) {
        this.SerialType = SerialType;
    }

    /**
     * Get 资源类型 batch:批次, order_in 入库, order_out: 出入 
     * @return ResType 资源类型 batch:批次, order_in 入库, order_out: 出入
     */
    public String getResType() {
        return this.ResType;
    }

    /**
     * Set 资源类型 batch:批次, order_in 入库, order_out: 出入
     * @param ResType 资源类型 batch:批次, order_in 入库, order_out: 出入
     */
    public void setResType(String ResType) {
        this.ResType = ResType;
    }

    /**
     * Get 资源ID ResType是 batch 时对应是批次ID, 是 order_in, order_out时，则是订单ID 
     * @return ResId 资源ID ResType是 batch 时对应是批次ID, 是 order_in, order_out时，则是订单ID
     */
    public String getResId() {
        return this.ResId;
    }

    /**
     * Set 资源ID ResType是 batch 时对应是批次ID, 是 order_in, order_out时，则是订单ID
     * @param ResId 资源ID ResType是 batch 时对应是批次ID, 是 order_in, order_out时，则是订单ID
     */
    public void setResId(String ResId) {
        this.ResId = ResId;
    }

    public DescribeCodePacksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCodePacksRequest(DescribeCodePacksRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.SerialType != null) {
            this.SerialType = new Long(source.SerialType);
        }
        if (source.ResType != null) {
            this.ResType = new String(source.ResType);
        }
        if (source.ResId != null) {
            this.ResId = new String(source.ResId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "SerialType", this.SerialType);
        this.setParamSimple(map, prefix + "ResType", this.ResType);
        this.setParamSimple(map, prefix + "ResId", this.ResId);

    }
}

