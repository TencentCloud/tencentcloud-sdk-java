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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLinkAdvancedLogRequest extends AbstractModel{

    /**
    * 云兔ID
    */
    @SerializedName("LinkID")
    @Expose
    private Long LinkID;

    /**
    * 是否激活高级日志 0 关闭 1激活
    */
    @SerializedName("IsAdLog")
    @Expose
    private Long IsAdLog;

    /**
     * Get 云兔ID 
     * @return LinkID 云兔ID
     */
    public Long getLinkID() {
        return this.LinkID;
    }

    /**
     * Set 云兔ID
     * @param LinkID 云兔ID
     */
    public void setLinkID(Long LinkID) {
        this.LinkID = LinkID;
    }

    /**
     * Get 是否激活高级日志 0 关闭 1激活 
     * @return IsAdLog 是否激活高级日志 0 关闭 1激活
     */
    public Long getIsAdLog() {
        return this.IsAdLog;
    }

    /**
     * Set 是否激活高级日志 0 关闭 1激活
     * @param IsAdLog 是否激活高级日志 0 关闭 1激活
     */
    public void setIsAdLog(Long IsAdLog) {
        this.IsAdLog = IsAdLog;
    }

    public ModifyLinkAdvancedLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLinkAdvancedLogRequest(ModifyLinkAdvancedLogRequest source) {
        if (source.LinkID != null) {
            this.LinkID = new Long(source.LinkID);
        }
        if (source.IsAdLog != null) {
            this.IsAdLog = new Long(source.IsAdLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LinkID", this.LinkID);
        this.setParamSimple(map, prefix + "IsAdLog", this.IsAdLog);

    }
}

