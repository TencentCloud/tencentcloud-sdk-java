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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotByTimeOffset2017 extends AbstractModel{

    /**
    * 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 截图的具体时间点，单位：毫秒。
    */
    @SerializedName("TimeOffset")
    @Expose
    private Long TimeOffset;

    /**
    * 截图输出文件地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 错误码
<li>0：成功；</li>
<li>其他值：失败。</li> 
     * @return ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     * @param ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 截图的具体时间点，单位：毫秒。 
     * @return TimeOffset 截图的具体时间点，单位：毫秒。
     */
    public Long getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set 截图的具体时间点，单位：毫秒。
     * @param TimeOffset 截图的具体时间点，单位：毫秒。
     */
    public void setTimeOffset(Long TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * Get 截图输出文件地址。 
     * @return Url 截图输出文件地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 截图输出文件地址。
     * @param Url 截图输出文件地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "TimeOffset", this.TimeOffset);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

