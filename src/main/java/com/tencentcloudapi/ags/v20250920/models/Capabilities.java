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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Capabilities extends AbstractModel {

    /**
    * <p>要添加的capabilities</p><p>取值参考：[&quot;SYS_ADMIN&quot;]</p>
    */
    @SerializedName("Add")
    @Expose
    private String [] Add;

    /**
    * <p>要移除的capabilities</p><p>取值参考：[&quot;ALL&quot;]</p>
    */
    @SerializedName("Drop")
    @Expose
    private String [] Drop;

    /**
     * Get <p>要添加的capabilities</p><p>取值参考：[&quot;SYS_ADMIN&quot;]</p> 
     * @return Add <p>要添加的capabilities</p><p>取值参考：[&quot;SYS_ADMIN&quot;]</p>
     */
    public String [] getAdd() {
        return this.Add;
    }

    /**
     * Set <p>要添加的capabilities</p><p>取值参考：[&quot;SYS_ADMIN&quot;]</p>
     * @param Add <p>要添加的capabilities</p><p>取值参考：[&quot;SYS_ADMIN&quot;]</p>
     */
    public void setAdd(String [] Add) {
        this.Add = Add;
    }

    /**
     * Get <p>要移除的capabilities</p><p>取值参考：[&quot;ALL&quot;]</p> 
     * @return Drop <p>要移除的capabilities</p><p>取值参考：[&quot;ALL&quot;]</p>
     */
    public String [] getDrop() {
        return this.Drop;
    }

    /**
     * Set <p>要移除的capabilities</p><p>取值参考：[&quot;ALL&quot;]</p>
     * @param Drop <p>要移除的capabilities</p><p>取值参考：[&quot;ALL&quot;]</p>
     */
    public void setDrop(String [] Drop) {
        this.Drop = Drop;
    }

    public Capabilities() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Capabilities(Capabilities source) {
        if (source.Add != null) {
            this.Add = new String[source.Add.length];
            for (int i = 0; i < source.Add.length; i++) {
                this.Add[i] = new String(source.Add[i]);
            }
        }
        if (source.Drop != null) {
            this.Drop = new String[source.Drop.length];
            for (int i = 0; i < source.Drop.length; i++) {
                this.Drop[i] = new String(source.Drop[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Add.", this.Add);
        this.setParamArraySimple(map, prefix + "Drop.", this.Drop);

    }
}

