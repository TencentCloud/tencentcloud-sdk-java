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

public class UnauthorizedCoresTendency extends AbstractModel{

    /**
    * 日期
    */
    @SerializedName("DateTime")
    @Expose
    private String DateTime;

    /**
    * 未授权的核数
    */
    @SerializedName("CoresCount")
    @Expose
    private Long CoresCount;

    /**
     * Get 日期 
     * @return DateTime 日期
     */
    public String getDateTime() {
        return this.DateTime;
    }

    /**
     * Set 日期
     * @param DateTime 日期
     */
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    /**
     * Get 未授权的核数 
     * @return CoresCount 未授权的核数
     */
    public Long getCoresCount() {
        return this.CoresCount;
    }

    /**
     * Set 未授权的核数
     * @param CoresCount 未授权的核数
     */
    public void setCoresCount(Long CoresCount) {
        this.CoresCount = CoresCount;
    }

    public UnauthorizedCoresTendency() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnauthorizedCoresTendency(UnauthorizedCoresTendency source) {
        if (source.DateTime != null) {
            this.DateTime = new String(source.DateTime);
        }
        if (source.CoresCount != null) {
            this.CoresCount = new Long(source.CoresCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateTime", this.DateTime);
        this.setParamSimple(map, prefix + "CoresCount", this.CoresCount);

    }
}

