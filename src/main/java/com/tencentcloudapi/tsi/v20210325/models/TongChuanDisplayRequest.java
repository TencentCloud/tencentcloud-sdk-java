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
package com.tencentcloudapi.tsi.v20210325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TongChuanDisplayRequest extends AbstractModel {

    /**
    * 一段完整的语音对应一个SessionUuid
    */
    @SerializedName("SessionUuid")
    @Expose
    private String SessionUuid;

    /**
    * 句子排序方式，1-由新到旧
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * 最多返回几句，目前只支持 5 条数据
    */
    @SerializedName("SeMax")
    @Expose
    private Long SeMax;

    /**
     * Get 一段完整的语音对应一个SessionUuid 
     * @return SessionUuid 一段完整的语音对应一个SessionUuid
     */
    public String getSessionUuid() {
        return this.SessionUuid;
    }

    /**
     * Set 一段完整的语音对应一个SessionUuid
     * @param SessionUuid 一段完整的语音对应一个SessionUuid
     */
    public void setSessionUuid(String SessionUuid) {
        this.SessionUuid = SessionUuid;
    }

    /**
     * Get 句子排序方式，1-由新到旧 
     * @return IsNew 句子排序方式，1-由新到旧
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set 句子排序方式，1-由新到旧
     * @param IsNew 句子排序方式，1-由新到旧
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get 最多返回几句，目前只支持 5 条数据 
     * @return SeMax 最多返回几句，目前只支持 5 条数据
     */
    public Long getSeMax() {
        return this.SeMax;
    }

    /**
     * Set 最多返回几句，目前只支持 5 条数据
     * @param SeMax 最多返回几句，目前只支持 5 条数据
     */
    public void setSeMax(Long SeMax) {
        this.SeMax = SeMax;
    }

    public TongChuanDisplayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TongChuanDisplayRequest(TongChuanDisplayRequest source) {
        if (source.SessionUuid != null) {
            this.SessionUuid = new String(source.SessionUuid);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.SeMax != null) {
            this.SeMax = new Long(source.SeMax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionUuid", this.SessionUuid);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "SeMax", this.SeMax);

    }
}

