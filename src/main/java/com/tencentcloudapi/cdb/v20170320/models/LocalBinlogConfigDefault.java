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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalBinlogConfigDefault extends AbstractModel{

    /**
    * 本地binlog保留时长，可取值范围：[72,168]。
    */
    @SerializedName("SaveHours")
    @Expose
    private Long SaveHours;

    /**
    * 本地binlog空间使用率，可取值范围：[30,50]。
    */
    @SerializedName("MaxUsage")
    @Expose
    private Long MaxUsage;

    /**
     * Get 本地binlog保留时长，可取值范围：[72,168]。 
     * @return SaveHours 本地binlog保留时长，可取值范围：[72,168]。
     */
    public Long getSaveHours() {
        return this.SaveHours;
    }

    /**
     * Set 本地binlog保留时长，可取值范围：[72,168]。
     * @param SaveHours 本地binlog保留时长，可取值范围：[72,168]。
     */
    public void setSaveHours(Long SaveHours) {
        this.SaveHours = SaveHours;
    }

    /**
     * Get 本地binlog空间使用率，可取值范围：[30,50]。 
     * @return MaxUsage 本地binlog空间使用率，可取值范围：[30,50]。
     */
    public Long getMaxUsage() {
        return this.MaxUsage;
    }

    /**
     * Set 本地binlog空间使用率，可取值范围：[30,50]。
     * @param MaxUsage 本地binlog空间使用率，可取值范围：[30,50]。
     */
    public void setMaxUsage(Long MaxUsage) {
        this.MaxUsage = MaxUsage;
    }

    public LocalBinlogConfigDefault() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalBinlogConfigDefault(LocalBinlogConfigDefault source) {
        if (source.SaveHours != null) {
            this.SaveHours = new Long(source.SaveHours);
        }
        if (source.MaxUsage != null) {
            this.MaxUsage = new Long(source.MaxUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SaveHours", this.SaveHours);
        this.setParamSimple(map, prefix + "MaxUsage", this.MaxUsage);

    }
}

