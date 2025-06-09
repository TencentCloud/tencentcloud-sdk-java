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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoicePrintRequest extends AbstractModel {

    /**
    * 查询方式，0表示查询特定VoicePrintId，1表示分页查询
    */
    @SerializedName("DescribeMode")
    @Expose
    private Long DescribeMode;

    /**
    * 声纹ID
    */
    @SerializedName("VoicePrintIdList")
    @Expose
    private String [] VoicePrintIdList;

    /**
    * 当前页码,从1开始,DescribeMode为1时填写
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 每页条数 最少20,DescribeMode为1时填写
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 查询方式，0表示查询特定VoicePrintId，1表示分页查询 
     * @return DescribeMode 查询方式，0表示查询特定VoicePrintId，1表示分页查询
     */
    public Long getDescribeMode() {
        return this.DescribeMode;
    }

    /**
     * Set 查询方式，0表示查询特定VoicePrintId，1表示分页查询
     * @param DescribeMode 查询方式，0表示查询特定VoicePrintId，1表示分页查询
     */
    public void setDescribeMode(Long DescribeMode) {
        this.DescribeMode = DescribeMode;
    }

    /**
     * Get 声纹ID 
     * @return VoicePrintIdList 声纹ID
     */
    public String [] getVoicePrintIdList() {
        return this.VoicePrintIdList;
    }

    /**
     * Set 声纹ID
     * @param VoicePrintIdList 声纹ID
     */
    public void setVoicePrintIdList(String [] VoicePrintIdList) {
        this.VoicePrintIdList = VoicePrintIdList;
    }

    /**
     * Get 当前页码,从1开始,DescribeMode为1时填写 
     * @return PageIndex 当前页码,从1开始,DescribeMode为1时填写
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 当前页码,从1开始,DescribeMode为1时填写
     * @param PageIndex 当前页码,从1开始,DescribeMode为1时填写
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 每页条数 最少20,DescribeMode为1时填写 
     * @return PageSize 每页条数 最少20,DescribeMode为1时填写
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数 最少20,DescribeMode为1时填写
     * @param PageSize 每页条数 最少20,DescribeMode为1时填写
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeVoicePrintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoicePrintRequest(DescribeVoicePrintRequest source) {
        if (source.DescribeMode != null) {
            this.DescribeMode = new Long(source.DescribeMode);
        }
        if (source.VoicePrintIdList != null) {
            this.VoicePrintIdList = new String[source.VoicePrintIdList.length];
            for (int i = 0; i < source.VoicePrintIdList.length; i++) {
                this.VoicePrintIdList[i] = new String(source.VoicePrintIdList[i]);
            }
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DescribeMode", this.DescribeMode);
        this.setParamArraySimple(map, prefix + "VoicePrintIdList.", this.VoicePrintIdList);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

