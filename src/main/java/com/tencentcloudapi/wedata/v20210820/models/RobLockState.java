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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RobLockState extends AbstractModel{

    /**
    * 是否可以抢锁
    */
    @SerializedName("IsRob")
    @Expose
    private Boolean IsRob;

    /**
    * 当前持锁人
    */
    @SerializedName("Locker")
    @Expose
    private String Locker;

    /**
     * Get 是否可以抢锁 
     * @return IsRob 是否可以抢锁
     */
    public Boolean getIsRob() {
        return this.IsRob;
    }

    /**
     * Set 是否可以抢锁
     * @param IsRob 是否可以抢锁
     */
    public void setIsRob(Boolean IsRob) {
        this.IsRob = IsRob;
    }

    /**
     * Get 当前持锁人 
     * @return Locker 当前持锁人
     */
    public String getLocker() {
        return this.Locker;
    }

    /**
     * Set 当前持锁人
     * @param Locker 当前持锁人
     */
    public void setLocker(String Locker) {
        this.Locker = Locker;
    }

    public RobLockState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RobLockState(RobLockState source) {
        if (source.IsRob != null) {
            this.IsRob = new Boolean(source.IsRob);
        }
        if (source.Locker != null) {
            this.Locker = new String(source.Locker);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsRob", this.IsRob);
        this.setParamSimple(map, prefix + "Locker", this.Locker);

    }
}

