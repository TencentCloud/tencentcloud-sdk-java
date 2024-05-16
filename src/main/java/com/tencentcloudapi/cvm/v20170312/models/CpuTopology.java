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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CpuTopology extends AbstractModel {

    /**
    * 决定启用的CPU物理核心数。
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * 每核心线程数。该参数决定是否开启或关闭超线程。<br><li>1 表示关闭超线程 </li><br><li>2 表示开启超线程</li>
 不设置时，实例使用默认的超线程策略。开关超线程请参考文档：[开启与关闭超线程](https://cloud.tencent.com/document/product/213/103798)。
    */
    @SerializedName("ThreadPerCore")
    @Expose
    private Long ThreadPerCore;

    /**
     * Get 决定启用的CPU物理核心数。 
     * @return CoreCount 决定启用的CPU物理核心数。
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set 决定启用的CPU物理核心数。
     * @param CoreCount 决定启用的CPU物理核心数。
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get 每核心线程数。该参数决定是否开启或关闭超线程。<br><li>1 表示关闭超线程 </li><br><li>2 表示开启超线程</li>
 不设置时，实例使用默认的超线程策略。开关超线程请参考文档：[开启与关闭超线程](https://cloud.tencent.com/document/product/213/103798)。 
     * @return ThreadPerCore 每核心线程数。该参数决定是否开启或关闭超线程。<br><li>1 表示关闭超线程 </li><br><li>2 表示开启超线程</li>
 不设置时，实例使用默认的超线程策略。开关超线程请参考文档：[开启与关闭超线程](https://cloud.tencent.com/document/product/213/103798)。
     */
    public Long getThreadPerCore() {
        return this.ThreadPerCore;
    }

    /**
     * Set 每核心线程数。该参数决定是否开启或关闭超线程。<br><li>1 表示关闭超线程 </li><br><li>2 表示开启超线程</li>
 不设置时，实例使用默认的超线程策略。开关超线程请参考文档：[开启与关闭超线程](https://cloud.tencent.com/document/product/213/103798)。
     * @param ThreadPerCore 每核心线程数。该参数决定是否开启或关闭超线程。<br><li>1 表示关闭超线程 </li><br><li>2 表示开启超线程</li>
 不设置时，实例使用默认的超线程策略。开关超线程请参考文档：[开启与关闭超线程](https://cloud.tencent.com/document/product/213/103798)。
     */
    public void setThreadPerCore(Long ThreadPerCore) {
        this.ThreadPerCore = ThreadPerCore;
    }

    public CpuTopology() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CpuTopology(CpuTopology source) {
        if (source.CoreCount != null) {
            this.CoreCount = new Long(source.CoreCount);
        }
        if (source.ThreadPerCore != null) {
            this.ThreadPerCore = new Long(source.ThreadPerCore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamSimple(map, prefix + "ThreadPerCore", this.ThreadPerCore);

    }
}

