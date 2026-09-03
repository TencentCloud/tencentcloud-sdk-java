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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnnotationContext extends AbstractModel {

    /**
    * <p>任务目标（整段视频的总目标）</p>
    */
    @SerializedName("TaskGoal")
    @Expose
    private String TaskGoal;

    /**
    * <p>关键物体列表</p>
    */
    @SerializedName("KeyObjects")
    @Expose
    private String [] KeyObjects;

    /**
    * <p>原子动词参考列表</p>
    */
    @SerializedName("AtomicVerbs")
    @Expose
    private String [] AtomicVerbs;

    /**
     * Get <p>任务目标（整段视频的总目标）</p> 
     * @return TaskGoal <p>任务目标（整段视频的总目标）</p>
     */
    public String getTaskGoal() {
        return this.TaskGoal;
    }

    /**
     * Set <p>任务目标（整段视频的总目标）</p>
     * @param TaskGoal <p>任务目标（整段视频的总目标）</p>
     */
    public void setTaskGoal(String TaskGoal) {
        this.TaskGoal = TaskGoal;
    }

    /**
     * Get <p>关键物体列表</p> 
     * @return KeyObjects <p>关键物体列表</p>
     */
    public String [] getKeyObjects() {
        return this.KeyObjects;
    }

    /**
     * Set <p>关键物体列表</p>
     * @param KeyObjects <p>关键物体列表</p>
     */
    public void setKeyObjects(String [] KeyObjects) {
        this.KeyObjects = KeyObjects;
    }

    /**
     * Get <p>原子动词参考列表</p> 
     * @return AtomicVerbs <p>原子动词参考列表</p>
     */
    public String [] getAtomicVerbs() {
        return this.AtomicVerbs;
    }

    /**
     * Set <p>原子动词参考列表</p>
     * @param AtomicVerbs <p>原子动词参考列表</p>
     */
    public void setAtomicVerbs(String [] AtomicVerbs) {
        this.AtomicVerbs = AtomicVerbs;
    }

    public AnnotationContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnnotationContext(AnnotationContext source) {
        if (source.TaskGoal != null) {
            this.TaskGoal = new String(source.TaskGoal);
        }
        if (source.KeyObjects != null) {
            this.KeyObjects = new String[source.KeyObjects.length];
            for (int i = 0; i < source.KeyObjects.length; i++) {
                this.KeyObjects[i] = new String(source.KeyObjects[i]);
            }
        }
        if (source.AtomicVerbs != null) {
            this.AtomicVerbs = new String[source.AtomicVerbs.length];
            for (int i = 0; i < source.AtomicVerbs.length; i++) {
                this.AtomicVerbs[i] = new String(source.AtomicVerbs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGoal", this.TaskGoal);
        this.setParamArraySimple(map, prefix + "KeyObjects.", this.KeyObjects);
        this.setParamArraySimple(map, prefix + "AtomicVerbs.", this.AtomicVerbs);

    }
}

