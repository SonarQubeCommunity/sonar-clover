package org.sonar.plugins.groovyimporter;/*
 * SonarSource :: Groovy-importer :: Fake plugin to import sources of groovy language
 * Copyright (C) 2009 ${owner}
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

import com.google.common.collect.Lists;
import org.sonar.api.SonarPlugin;

import java.util.List;

public class GroovyImporterPlugin extends SonarPlugin {
  public List getExtensions() {
    return Lists.newArrayList(Groovy.class, GroovySourceImporter.class);
  }


}
