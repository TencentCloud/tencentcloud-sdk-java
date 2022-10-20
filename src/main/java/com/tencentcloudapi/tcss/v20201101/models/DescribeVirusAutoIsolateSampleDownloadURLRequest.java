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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusAutoIsolateSampleDownloadURLRequest extends AbstractModel{

    /**
    * 样本Md5值
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
     * Get 样本Md5值 
     * @return MD5 样本Md5值
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 样本Md5值
     * @param MD5 样本Md5值
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    public DescribeVirusAutoIsolateSampleDownloadURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusAutoIsolateSampleDownloadURLRequest(DescribeVirusAutoIsolateSampleDownloadURLRequest source) {
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MD5", this.MD5);

    }
}

