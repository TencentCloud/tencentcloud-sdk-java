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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartDrugInfoRequest extends AbstractModel {

    /**
    * 请求头
    */
    @SerializedName("Header")
    @Expose
    private CommonHeader Header;

    /**
    * 药品信息
    */
    @SerializedName("Data")
    @Expose
    private SmartDrugInfoData Data;

    /**
     * Get 请求头 
     * @return Header 请求头
     */
    public CommonHeader getHeader() {
        return this.Header;
    }

    /**
     * Set 请求头
     * @param Header 请求头
     */
    public void setHeader(CommonHeader Header) {
        this.Header = Header;
    }

    /**
     * Get 药品信息 
     * @return Data 药品信息
     */
    public SmartDrugInfoData getData() {
        return this.Data;
    }

    /**
     * Set 药品信息
     * @param Data 药品信息
     */
    public void setData(SmartDrugInfoData Data) {
        this.Data = Data;
    }

    public SmartDrugInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartDrugInfoRequest(SmartDrugInfoRequest source) {
        if (source.Header != null) {
            this.Header = new CommonHeader(source.Header);
        }
        if (source.Data != null) {
            this.Data = new SmartDrugInfoData(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Header.", this.Header);
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

