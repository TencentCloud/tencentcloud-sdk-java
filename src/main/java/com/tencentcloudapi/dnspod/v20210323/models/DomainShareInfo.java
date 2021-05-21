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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainShareInfo extends AbstractModel{

    /**
    * 域名共享对象的账号
    */
    @SerializedName("ShareTo")
    @Expose
    private String ShareTo;

    /**
    * 共享模式，“rw”：可读写。 “r”:：只读
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 共享状态“enabled”：共享成功。“pending”：共享到的账号不存在, 等待注册
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 域名共享对象的账号 
     * @return ShareTo 域名共享对象的账号
     */
    public String getShareTo() {
        return this.ShareTo;
    }

    /**
     * Set 域名共享对象的账号
     * @param ShareTo 域名共享对象的账号
     */
    public void setShareTo(String ShareTo) {
        this.ShareTo = ShareTo;
    }

    /**
     * Get 共享模式，“rw”：可读写。 “r”:：只读 
     * @return Mode 共享模式，“rw”：可读写。 “r”:：只读
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 共享模式，“rw”：可读写。 “r”:：只读
     * @param Mode 共享模式，“rw”：可读写。 “r”:：只读
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 共享状态“enabled”：共享成功。“pending”：共享到的账号不存在, 等待注册 
     * @return Status 共享状态“enabled”：共享成功。“pending”：共享到的账号不存在, 等待注册
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 共享状态“enabled”：共享成功。“pending”：共享到的账号不存在, 等待注册
     * @param Status 共享状态“enabled”：共享成功。“pending”：共享到的账号不存在, 等待注册
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DomainShareInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainShareInfo(DomainShareInfo source) {
        if (source.ShareTo != null) {
            this.ShareTo = new String(source.ShareTo);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShareTo", this.ShareTo);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

